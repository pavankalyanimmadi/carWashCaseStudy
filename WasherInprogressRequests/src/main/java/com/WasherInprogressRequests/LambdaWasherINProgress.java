package com.WasherInprogressRequests;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.WasherInprogressRequests.pojo.OrderFullDetail;
import com.WasherInprogressRequests.pojo.Washer;
import com.WasherInprogressRequests.service.WashOrderService;

@Component
public class LambdaWasherINProgress implements Function<Washer, List<OrderFullDetail>> {
	
	@Autowired
	private WashOrderService service;

	@Override
	public List<OrderFullDetail> apply(Washer t) {
		return service.washerInprogress(t.getEmailId());
	}

}
