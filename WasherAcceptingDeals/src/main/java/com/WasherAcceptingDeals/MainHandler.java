package com.WasherAcceptingDeals;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.WasherAcceptingDeals.pojo.WashOrder;

public class MainHandler extends SpringBootRequestHandler<WashOrder, WashOrder> {

}
