package com.CustomerFeedback.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerFeedback.pojo.WashOrder;
import com.CustomerFeedback.repo.WashOrderRepo;


@Service
public class WashOrderService {
	
	@Autowired
	private WashOrderRepo repo;
	
	
	
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
