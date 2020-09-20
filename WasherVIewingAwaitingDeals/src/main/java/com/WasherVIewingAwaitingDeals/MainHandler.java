package com.WasherVIewingAwaitingDeals;

import java.util.List;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.WasherVIewingAwaitingDeals.pojo.OrderFullDetail;

public class MainHandler extends SpringBootRequestHandler<Object, List<OrderFullDetail>>{

}
