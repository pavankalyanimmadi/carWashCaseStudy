package com.CustomerOrderingWashService;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.CustomerOrderingWashService.pojo.WashOrder;

public class MainHandler extends SpringBootRequestHandler<WashOrder, WashOrder> {

}
