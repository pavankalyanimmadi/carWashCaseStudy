package com.WasherServedRequests;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.WasherServedRequests.pojo.OrderFullDetail;
import com.WasherServedRequests.pojo.Washer;
import com.WasherServedRequests.service.WashOrderService;

@Component
public class LambdaWasherServed implements Function<Washer, List<OrderFullDetail>> {
	
	@Autowired
	private WashOrderService service;

	@Override
	public List<OrderFullDetail> apply(Washer t) {
		return service.washerOldRequests(t.getEmailId());
	}

}
