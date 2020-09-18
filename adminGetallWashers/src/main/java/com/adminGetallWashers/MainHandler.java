package com.adminGetallWashers;

import java.util.List;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.adminGetallWashers.pojo.Washer;

public class MainHandler extends SpringBootRequestHandler<Object, List<Washer>> {

}
