package com.payment.MainPaymentService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.MainPaymentService.pojo.Payment;
import com.payment.MainPaymentService.pojo.WashOrder;
import com.payment.MainPaymentService.repo.PaymentsRepo;
import com.payment.MainPaymentService.repo.WashOrderRepo;



@Service
public class PaymentService {
	
	@Autowired
	private PaymentsRepo repo;
	
	@Autowired
	private WashOrderRepo orderRepo;
	
	public Payment savePaymentDetails(Payment payment)
	{
		Optional<WashOrder> order=orderRepo.findById(payment.getOrderId());
		if(order.isPresent())
		{
			WashOrder temp=order.get();
			temp.setPaymentStatus(true);
			
			Payment savedPayment=repo.save(payment);
			
			temp.setPaymentId(savedPayment.getPaymentId());
			orderRepo.save(temp);
			return savedPayment;
		}
		
		return null;
		
		
	}
	
	

}
