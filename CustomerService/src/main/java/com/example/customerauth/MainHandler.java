package com.example.customerauth;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.example.customerauth.pojo.Customer;

public class MainHandler extends SpringBootRequestHandler<Customer, Object> {

}
