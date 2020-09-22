package com.payment.payments;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.payment.payments.pojo.Payment;

public class MainHandler extends SpringBootRequestHandler<Payment, Payment> {

}
