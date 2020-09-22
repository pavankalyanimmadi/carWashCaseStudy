package com.payment.payments;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.payment.payments.pojo.Payment;
import com.payment.payments.service.PaymentService;

@Component
public class LambdaPayment implements Function<Payment, Payment>{
	
	@Autowired
	private PaymentService service;

	@Override
	public Payment apply(Payment t) {
		return service.savePaymentDetails(t);
	}

}
