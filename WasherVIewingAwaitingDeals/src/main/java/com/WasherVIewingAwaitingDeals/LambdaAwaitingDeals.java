package com.WasherVIewingAwaitingDeals;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.WasherVIewingAwaitingDeals.pojo.OrderFullDetail;
import com.WasherVIewingAwaitingDeals.service.WashOrderService;

@Component
public class LambdaAwaitingDeals implements Function<Object, List<OrderFullDetail>> {
	
	@Autowired
	private WashOrderService service;

	@Override
	public List<OrderFullDetail> apply(Object t) {
		return service.getAllCustomerRequests();
	}

}
