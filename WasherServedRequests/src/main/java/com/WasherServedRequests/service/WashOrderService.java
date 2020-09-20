package com.WasherServedRequests.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.WasherServedRequests.pojo.Customer;
import com.WasherServedRequests.pojo.OrderFullDetail;
import com.WasherServedRequests.pojo.WashOrder;
import com.WasherServedRequests.pojo.WashPackage;
import com.WasherServedRequests.pojo.Washer;
import com.WasherServedRequests.repo.CustomerRepo;
import com.WasherServedRequests.repo.OrderRepo;
import com.WasherServedRequests.repo.WashPackageRepo;
import com.WasherServedRequests.repo.WasherRepo;


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
	
	
	
	
	public List<OrderFullDetail> washerOldRequests(String emailId)
	{
		List<WashOrder> allOrders=getAllOrders();
		List<OrderFullDetail> requiredList=new ArrayList<OrderFullDetail>();
		
		for(WashOrder temp:allOrders)
		{
			if(temp.getWasherId()!=null)
			{
				if(temp.getWasherId().contentEquals(emailId) && temp.getOrderStatus().contentEquals("SERVED"))
				{
					OrderFullDetail orderFullDetail=settingUp(temp);
					
					Customer customer=getCustomer(temp.getCustomerId());
				    orderFullDetail.setCustomerName(customer.getName());
				    orderFullDetail.setCustomerPhoneNumber(customer.getMobileNumber());
				    
                    WashPackage pack=getPackage(temp.getPakcageId()); 
					
					orderFullDetail.setOrderPackageName(pack.getPackageName());
					orderFullDetail.setOrderPackageDescription(pack.getPackageDescription());
					orderFullDetail.setOrderPackagePrice(pack.getPackageCost());
				    
				    requiredList.add(orderFullDetail);
					
					
					
				}
				
			}
			
			
		}
		
		return requiredList;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
