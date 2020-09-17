package com.example.customerauth;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.customerauth.pojo.Customer;
import com.example.customerauth.service.CustomerService;

@Component
public class CustomerAuthe implements Function<Customer,Object> {
	
	@Autowired
	private CustomerService customerService;

	@Override
	public Object apply(Customer t) {
		return customerService.signup(t);
	}

}
