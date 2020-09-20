package com.CustomerServedRequests;

import java.util.List;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.CustomerServedRequests.pojo.Customer;
import com.CustomerServedRequests.pojo.OrderFullDetail;

public class MainHandler extends SpringBootRequestHandler<Customer, List<OrderFullDetail>> {

}
