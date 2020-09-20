package com.CustomerServedRequests.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.CustomerServedRequests.pojo.Customer;
import com.CustomerServedRequests.pojo.OrderFullDetail;
import com.CustomerServedRequests.pojo.WashOrder;
import com.CustomerServedRequests.pojo.WashPackage;
import com.CustomerServedRequests.pojo.Washer;
import com.CustomerServedRequests.repo.CustomerRepo;
import com.CustomerServedRequests.repo.OrderRepo;
import com.CustomerServedRequests.repo.WashPackageRepo;
import com.CustomerServedRequests.repo.WasherRepo;

@Service
public class WashOrderService {
	
	@Autowired
	private CustomerRepo cusRepo;
	@Autowired
	private WasherRepo washerRepo;
	@Autowired
	private OrderRepo orderRepo;
	
	@Autowired
	private WashPackageRepo packRepo;
	
	
	public Customer getCustomer(String emailId)
	{
		return cusRepo.findById(emailId).get();
	}
	
	
	public Washer getWasher(String emailId)
	{
		return washerRepo.findById(emailId).get();
	}
	
	public WashPackage getPackage(String packageId)
	{
		return packRepo.findById(packageId).get();
		
	}
	
	
	public List<WashOrder> getAllOrders()
	{
		return orderRepo.findAll();
	}
	
	
	public OrderFullDetail settingUp(WashOrder temp)
	{
		OrderFullDetail orderFullDetail=new OrderFullDetail();
		
		orderFullDetail.setCarModel(temp.getCarModel());
		orderFullDetail.setCarNumber(temp.getCarNumber());
		orderFullDetail.setCustomerId(temp.getCustomerId());
		orderFullDetail.setDate(temp.getDate());
		orderFullDetail.setLocation(temp.getLocation());
		orderFullDetail.setOrderStatus(temp.getOrderStatus());
		orderFullDetail.setOredrId(temp.getOredrId());
		orderFullDetail.setTime(temp.getTime());
		orderFullDetail.setRating(temp.getRating());
		orderFullDetail.setComments(temp.getComments());
		
		return orderFullDetail;
		
	}
	
	
	
	
	
	
	public List<OrderFullDetail> customerOldRequests(String customerId)
	{
		List<WashOrder> allOrders=getAllOrders();
		List<OrderFullDetail> requiredList=new ArrayList<OrderFullDetail>();
		
		for(WashOrder temp:allOrders)
		{
			if(temp.getCustomerId().contentEquals(customerId) && temp.getOrderStatus().contentEquals("SERVED"))
			{
				OrderFullDetail orderFullDetail=settingUp(temp);
				Washer washer=getWasher(temp.getWasherId());
				orderFullDetail.setWasherName(washer.getName());
				orderFullDetail.setWasherPhoneNumber(washer.getPhoneNumber());
				
				WashPackage pack=getPackage(temp.getPakcageId());
				
				orderFullDetail.setOrderPackageName(pack.getPackageName());
				orderFullDetail.setOrderPackageDescription(pack.getPackageDescription());
				orderFullDetail.setOrderPackagePrice(pack.getPackageCost());
				
				requiredList.add(orderFullDetail);
				
				
				
				
				
				
				
				
				
				
			}
			
		}
		return requiredList;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
