package com.WasherInprogressRequests;

import java.util.List;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.WasherInprogressRequests.pojo.OrderFullDetail;
import com.WasherInprogressRequests.pojo.Washer;

public class MainHandler extends SpringBootRequestHandler<Washer, List<OrderFullDetail>> {

}
