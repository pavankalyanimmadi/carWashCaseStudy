package com.adminGetallCustomers;

import java.util.List;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.adminGetallCustomers.pojo.Customer;

public class MainHandler extends SpringBootRequestHandler<Object, List<Customer>> {

}
