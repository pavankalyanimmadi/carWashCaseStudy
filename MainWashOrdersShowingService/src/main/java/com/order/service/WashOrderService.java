package com.order.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.order.pojo.Customer;
import com.order.pojo.OrderFullDetail;
import com.order.pojo.Payment;
import com.order.pojo.WashOrder;
import com.order.pojo.WashPackage;
import com.order.pojo.Washer;
import com.order.repo.CustomerRepo;
import com.order.repo.OrderRepo;
import com.order.repo.PaymentsRepo;
import com.order.repo.WashPackageRepo;
import com.order.repo.WasherRepo;


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
	
	
	@Autowired
	private PaymentsRepo paymentsRepo;
	
	
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
		orderFullDetail.setPaymentStatus(temp.isPaymentStatus());
		orderFullDetail.setPaymentId(temp.getPaymentId());
		
		orderFullDetail.setRating(temp.getRating());
		orderFullDetail.setComments(temp.getComments());
		
		if(temp.isPaymentStatus())
		{
			Optional<Payment> paytemp=paymentsRepo.findById(temp.getPaymentId());
			if(paytemp.isPresent())
			{
				Payment payment=paytemp.get();
				orderFullDetail.setPaymentCardNumber(payment.getCardNumber());
			}
			
		}
		
		
		
		
		return orderFullDetail;
		
	}
	
	
	
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
	
	
	public List<OrderFullDetail> washerInprogress(String emailId)
	{
		List<WashOrder> allOrders=getAllOrders();
		List<OrderFullDetail> requiredList=new ArrayList<OrderFullDetail>();
		for(WashOrder temp:allOrders)
		{
			if(temp.getWasherId()!=null)
			{
				if(temp.getWasherId().contentEquals(emailId) && temp.getOrderStatus().contentEquals("IN PROGRESS"))
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
