package com.WasherVIewingAwaitingDeals.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.WasherVIewingAwaitingDeals.pojo.Customer;
import com.WasherVIewingAwaitingDeals.pojo.OrderFullDetail;
import com.WasherVIewingAwaitingDeals.pojo.WashOrder;
import com.WasherVIewingAwaitingDeals.pojo.WashPackage;
import com.WasherVIewingAwaitingDeals.pojo.Washer;
import com.WasherVIewingAwaitingDeals.repo.CustomerRepo;
import com.WasherVIewingAwaitingDeals.repo.OrderRepo;
import com.WasherVIewingAwaitingDeals.repo.WashPackageRepo;
import com.WasherVIewingAwaitingDeals.repo.WasherRepo;


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
		
		return orderFullDetail;
		
	} 
	
	
	
	
	
	public List<OrderFullDetail> getAllCustomerRequests()
	{
		List<WashOrder> allOrders=getAllOrders();
		List<OrderFullDetail> requiredList=new ArrayList<OrderFullDetail>();
		for(WashOrder temp:allOrders)
		{
			if(temp.getOrderStatus().contentEquals("REQUESTED"))
			{
                    OrderFullDetail orderFullDetail=settingUp(temp);
				
				Customer cus=getCustomer(temp.getCustomerId());  
				
				orderFullDetail.setCustomerName(cus.getName());
				orderFullDetail.setCustomerPhoneNumber(cus.getMobileNumber());
				WashPackage pack=getPackage(temp.getPakcageId());
				
				orderFullDetail.setOrderPackageDescription(pack.getPackageDescription());
				orderFullDetail.setOrderPackageName(pack.getPackageName());
				orderFullDetail.setOrderPackagePrice(pack.getPackageCost());
				
				requiredList.add(orderFullDetail);
				
				
				
				
				
				
				
				
			}
			
			
		}
		return requiredList; 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
