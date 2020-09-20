package com.WasherServedRequests;

import java.util.List;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.WasherServedRequests.pojo.OrderFullDetail;
import com.WasherServedRequests.pojo.Washer;

public class MainHandler extends SpringBootRequestHandler<Washer, List<OrderFullDetail>> {

}
