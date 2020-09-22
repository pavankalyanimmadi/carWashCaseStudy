package com.AdminDeleteCustomer;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.AdminDeleteCustomer.pojo.Customer;
import com.AdminDeleteCustomer.service.CustomerService;

@Component
public class LambdaAdminDeleteCustomer implements Function<Customer, Customer> {
	
	@Autowired
	private CustomerService service;

	@Override
	public Customer apply(Customer t) {
		return service.deleteCustomer(t);
	}

}
