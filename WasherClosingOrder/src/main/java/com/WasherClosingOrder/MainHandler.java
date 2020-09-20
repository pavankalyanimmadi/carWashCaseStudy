package com.WasherClosingOrder;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.WasherClosingOrder.pojo.WashOrder;

public class MainHandler  extends SpringBootRequestHandler<WashOrder, WashOrder> {

}
