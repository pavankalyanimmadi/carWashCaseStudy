package com.payment.MainPaymentService.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payment.MainPaymentService.pojo.Payment;
import com.payment.MainPaymentService.service.PaymentService;


@RestController
@CrossOrigin("*")
public class PaymentsController {
	
	@Autowired
	private PaymentService service;
	
	@PostMapping("/savepaymentdetails")
	public Payment savePaymentDetails(@RequestBody Payment payment)
	{
		return service.savePaymentDetails(payment);
	}

}
