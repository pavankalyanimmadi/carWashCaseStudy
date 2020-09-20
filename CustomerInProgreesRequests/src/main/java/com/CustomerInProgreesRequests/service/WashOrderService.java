package com.CustomerInProgreesRequests.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.CustomerInProgreesRequests.pojo.Customer;
import com.CustomerInProgreesRequests.pojo.OrderFullDetail;
import com.CustomerInProgreesRequests.pojo.WashOrder;
import com.CustomerInProgreesRequests.pojo.WashPackage;
import com.CustomerInProgreesRequests.pojo.Washer;
import com.CustomerInProgreesRequests.repo.CustomerRepo;
import com.CustomerInProgreesRequests.repo.OrderRepo;
import com.CustomerInProgreesRequests.repo.WashPackageRepo;
import com.CustomerInProgreesRequests.repo.WasherRepo;

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
	
	
	
	
	
	public List<OrderFullDetail> customerInProgressRequests(String customerId)
	{
		List<WashOrder> allOrders=orderRepo.findAll();
		List<OrderFullDetail> requiredList=new ArrayList<OrderFullDetail>();
		
		for(WashOrder temp:allOrders)
		{
		  if(temp.getCustomerId()!=null)
		  {
			
			if(temp.getCustomerId().contentEquals(customerId) && ((temp.getOrderStatus().contentEquals("IN PROGRESS")) || (temp.getOrderStatus().contentEquals("REQUESTED"))))
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
				
				Optional<Customer> tempCustomer=cusRepo.findById(temp.getCustomerId());
				Customer cust=new Customer();
				if(tempCustomer.isPresent())
				{
					cust=tempCustomer.get();
				}
				
				if(temp.getWasherId()!=null)
				{
					Optional<Washer> tempWasher=washerRepo.findById(temp.getWasherId());
					Washer washer=new Washer();
					if(tempWasher.isPresent())
					{
						washer=tempWasher.get();
					}
					orderFullDetail.setWasherName(washer.getName());
					orderFullDetail.setWasherPhoneNumber(washer.getPhoneNumber());
					
					
					
					
				}
				
				
				
				Optional<WashPackage> pack=packRepo.findById(temp.getPakcageId());
				WashPackage packtemp=new WashPackage();
				if(pack.isPresent())
				{
					packtemp=pack.get();
				} 
				
				orderFullDetail.setOrderPackageName(packtemp.getPackageName());
				orderFullDetail.setOrderPackageDescription(packtemp.getPackageDescription());
				orderFullDetail.setOrderPackagePrice(packtemp.getPackageCost());
				
				requiredList.add(orderFullDetail);
				
			}
			
			
		}
		}
		
		return requiredList;
		
		  
	}
	
	
	
	
}
