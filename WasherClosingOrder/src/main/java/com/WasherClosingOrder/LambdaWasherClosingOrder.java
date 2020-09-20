package com.WasherClosingOrder;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.WasherClosingOrder.pojo.WashOrder;
import com.WasherClosingOrder.service.WashOrderService;

@Component
public class LambdaWasherClosingOrder implements Function<WashOrder, WashOrder> {
	
	@Autowired
   private WashOrderService service;

	@Override
	public WashOrder apply(WashOrder t) {
		return service.orderServed(t);
	}

}
