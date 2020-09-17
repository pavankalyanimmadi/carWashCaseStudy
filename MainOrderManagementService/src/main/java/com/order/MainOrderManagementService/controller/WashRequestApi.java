package com.order.MainOrderManagementService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.MainOrderManagementService.pojo.WashOrder;
import com.order.MainOrderManagementService.service.WashOrderService;



@RestController
@CrossOrigin("*")
public class WashRequestApi {
	
	@Autowired
	private WashOrderService service;
	
	
	@PostMapping("/saveorder")
	public WashOrder saveOrder(@RequestBody WashOrder order) 
	{
		System.out.println(order); 
		return service.saveOrder(order);
	}
	
	
	@PostMapping("/acceptorder")
	public WashOrder acceptingOrder(@RequestBody WashOrder order)
	{
		return service.acceptingOrder(order); 
	}
	
	
	@PostMapping("/orderserved")
	public WashOrder orderServed(@RequestBody WashOrder order )
	{
		return service.orderServed(order);
		
	}
	
	
	@PostMapping("/savingfeedback")
	public WashOrder savingFeedback(@RequestBody WashOrder order)
	
	{
		return service.savingfeedback(order);
		
	}
	
	
	
	

}
