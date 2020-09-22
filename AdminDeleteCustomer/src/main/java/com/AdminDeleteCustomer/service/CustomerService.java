package com.AdminDeleteCustomer.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.AdminDeleteCustomer.pojo.Customer;
import com.AdminDeleteCustomer.repo.CustomerRepo;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	
	
	
	
	public Customer deleteCustomer(Customer customer)
	{
		Optional<Customer> temp=customerRepo.findById(customer.getEmailId());
		if(temp.isPresent())
		{
			Customer existed=temp.get();
			customerRepo.delete(existed);
			return existed;
		}
		return null;
		
	}
	

}
