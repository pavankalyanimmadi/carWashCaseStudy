package com.order.MainOrderManagementService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.MainOrderManagementService.pojo.WashOrder;
import com.order.MainOrderManagementService.repo.WashOrderRepo;


@Service
public class WashOrderService {
	
	@Autowired
	private WashOrderRepo repo;
	
	public WashOrder saveOrder(WashOrder order)
	{
		order.setPaymentStatus(false);
		order.setPaymentId(null);
		order.setOrderStatus("REQUESTED");
		order.setWasherId(null);
		return repo.save(order);
		
	}
	
	
	public WashOrder acceptingOrder(WashOrder order)
	{
		WashOrder temp=repo.findById(order.getOredrId()).get();
		
		temp.setWasherId(order.getWasherId());
		
		
		temp.setOrderStatus("IN PROGRESS");
		return repo.save(temp);
		
	}
	
	
	
	public WashOrder orderServed(WashOrder order)
	{
		WashOrder temp=repo.findById(order.getOredrId()).get();
		temp.setOrderStatus("SERVED");
		
		return repo.save(temp);
		
	}
	
	public WashOrder savingfeedback(WashOrder order)
	{
		Optional<WashOrder> temp=repo.findById(order.getOredrId());
		if(temp.isPresent())
		{
			WashOrder existed=temp.get();
			existed.setRating(order.getRating());
			existed.setComments(order.getComments());
			return repo.save(existed);
		}
		return null;
		
	}
	
	
	 
	
	
	
	
	
	

}
