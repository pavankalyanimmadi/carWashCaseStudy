package com.CustomerInProgreesRequests;

import java.util.List;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.CustomerInProgreesRequests.pojo.Customer;
import com.CustomerInProgreesRequests.pojo.OrderFullDetail;

public class MainHandler extends SpringBootRequestHandler<Customer, List<OrderFullDetail>> {

}
