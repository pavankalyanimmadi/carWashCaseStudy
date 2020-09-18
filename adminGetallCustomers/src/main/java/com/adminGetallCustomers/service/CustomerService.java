package com.adminGetallCustomers.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.adminGetallCustomers.pojo.Car;
import com.adminGetallCustomers.pojo.Customer;
import com.adminGetallCustomers.repo.CustomerRepo;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	
	
	
	
	
	public List<Customer> getAllCUstomers()
	{
		return customerRepo.findAll();
	}
	
	
	

}
