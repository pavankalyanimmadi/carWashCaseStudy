package com.CustomerOrderingWashService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerOrderingWashService.pojo.WashOrder;
import com.CustomerOrderingWashService.repo.WashOrderRepo;


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
	
	
	
	
	
	 
	
	
	
	
	
	

}
