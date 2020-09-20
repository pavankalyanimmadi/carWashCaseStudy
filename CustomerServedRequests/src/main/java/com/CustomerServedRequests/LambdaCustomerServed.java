package com.CustomerServedRequests;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.CustomerServedRequests.pojo.Customer;
import com.CustomerServedRequests.pojo.OrderFullDetail;
import com.CustomerServedRequests.service.WashOrderService;

@Component
public class LambdaCustomerServed implements Function<Customer, List<OrderFullDetail>> {
	
	@Autowired
	private WashOrderService service;

	@Override
	public List<OrderFullDetail> apply(Customer t) {
		return service.customerOldRequests(t.getEmailId());
	}

}
