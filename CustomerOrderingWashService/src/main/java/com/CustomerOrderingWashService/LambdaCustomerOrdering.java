package com.CustomerOrderingWashService;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.CustomerOrderingWashService.pojo.WashOrder;
import com.CustomerOrderingWashService.service.WashOrderService;

@Component
public class LambdaCustomerOrdering implements Function<WashOrder, WashOrder>{
	
	@Autowired
	private WashOrderService service;

	@Override
	public WashOrder apply(WashOrder t) {
		return service.saveOrder(t);
	}

}
