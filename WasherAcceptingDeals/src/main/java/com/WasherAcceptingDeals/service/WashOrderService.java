package com.WasherAcceptingDeals.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WasherAcceptingDeals.pojo.WashOrder;
import com.WasherAcceptingDeals.repo.WashOrderRepo;

@Service
public class WashOrderService {
	
	@Autowired
	private WashOrderRepo repo;
	
	
	
	public WashOrder acceptingOrder(WashOrder order)
	{
		WashOrder temp=repo.findById(order.getOredrId()).get();
		
		temp.setWasherId(order.getWasherId());
		
		
		temp.setOrderStatus("IN PROGRESS");
		return repo.save(temp);
		
	}
	
	
	
	
	
	
	 
	
	
	
	
	
	

}
