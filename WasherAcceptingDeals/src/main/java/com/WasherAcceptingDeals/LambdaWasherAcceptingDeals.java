package com.WasherAcceptingDeals;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.WasherAcceptingDeals.pojo.WashOrder;
import com.WasherAcceptingDeals.service.WashOrderService;

@Component
public class LambdaWasherAcceptingDeals implements Function<WashOrder, WashOrder>{
	
	
	@Autowired
	private WashOrderService service;

	@Override
	public WashOrder apply(WashOrder t) {
		return service.acceptingOrder(t);
	}

}
