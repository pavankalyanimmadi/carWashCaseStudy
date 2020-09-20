package com.CustomerFeedback;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.CustomerFeedback.pojo.WashOrder;
import com.CustomerFeedback.service.WashOrderService;

@Component
public class LambdaCustomerFeedback implements Function<WashOrder, WashOrder> {
	
	@Autowired
	private WashOrderService service;

	@Override
	public WashOrder apply(WashOrder t) {
		return service.savingfeedback(t);
	}

}
