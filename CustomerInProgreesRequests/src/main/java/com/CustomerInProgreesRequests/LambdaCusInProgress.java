package com.CustomerInProgreesRequests;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.CustomerInProgreesRequests.pojo.Customer;
import com.CustomerInProgreesRequests.pojo.OrderFullDetail;
import com.CustomerInProgreesRequests.service.WashOrderService;

@Component
public class LambdaCusInProgress implements Function<Customer, List<OrderFullDetail>> {
	
	
 @Autowired
 private WashOrderService service;

	@Override
	public List<OrderFullDetail> apply(Customer t) {
		return service.customerInProgressRequests(t.getEmailId());
	}

}
