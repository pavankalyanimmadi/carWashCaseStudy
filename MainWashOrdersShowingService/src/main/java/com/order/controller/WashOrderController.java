package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.pojo.Customer;
import com.order.pojo.OrderFullDetail;
import com.order.pojo.Washer;
import com.order.service.WashOrderService;



@RestController
@CrossOrigin("*")
public class WashOrderController {
	
	
	@Autowired
	private WashOrderService service;
	
	
	
	
	@GetMapping("/awaitingrequests")
	public List<OrderFullDetail> getallCustomerRequests()
	{
		return service.getAllCustomerRequests();
	}
	
	
	
	@PostMapping("/customerinprorequests")
	public List<OrderFullDetail> customerInProgressRequests(@RequestBody Customer cus)
	{
		System.out.println("in controller"+ cus.getEmailId());
		return service.customerInProgressRequests(cus.getEmailId());
		 
	}  
	
	
	@PostMapping("/customeroldrequest")
	public List<OrderFullDetail> customerOldRequests(@RequestBody Customer cus)
	{
		return service.customerOldRequests(cus.getEmailId());
		
	}
	
	@PostMapping("/washerinprogress")
	public List<OrderFullDetail> washerInProgress(@RequestBody Washer washer)
	{
		//System.out.println("in controller      "+washer.getEmailId());
		return service.washerInprogress(washer.getEmailId());
		
	}
	
	
	@PostMapping("/washeroldrequests")
	public List<OrderFullDetail> customerOldRequests(@RequestBody Washer washer)
	{
		//syste.out.println("in controller      "+washer.getEmailId());
		return service.washerOldRequests(washer.getEmailId());
		
	}
	
	

}
