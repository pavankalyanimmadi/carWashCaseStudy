package com.WasherClosingOrder.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WasherClosingOrder.pojo.WashOrder;
import com.WasherClosingOrder.repo.WashOrderRepo;


@Service
public class WashOrderService {
	
	@Autowired
	private WashOrderRepo repo;
	
	
	
	public WashOrder orderServed(WashOrder order)
	{
		WashOrder temp=repo.findById(order.getOredrId()).get();
		temp.setOrderStatus("SERVED");
		
		return repo.save(temp);
		
	}
	
	
	
	
	 
	
	
	
	
	
	

}
