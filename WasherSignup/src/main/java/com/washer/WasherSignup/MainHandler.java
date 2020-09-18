package com.washer.WasherSignup;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.washer.WasherSignup.pojo.Washer;

public class MainHandler extends SpringBootRequestHandler<Washer, Washer> {

}
