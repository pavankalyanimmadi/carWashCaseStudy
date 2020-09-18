package com.adminGetallCustomers;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adminGetallCustomers.pojo.Customer;
import com.adminGetallCustomers.service.CustomerService;

@Component
public class LambdaGetALlCUstomers implements Function<Object, List<Customer>> {
	
	
	@Autowired
	private CustomerService service;

	@Override
	public List<Customer> apply(Object t) {
		return service.getAllCUstomers();
	}

}
