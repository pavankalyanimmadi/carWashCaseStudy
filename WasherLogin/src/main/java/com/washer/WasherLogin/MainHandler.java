package com.washer.WasherLogin;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.washer.WasherLogin.pojo.Washer;

public class MainHandler extends SpringBootRequestHandler<Washer, Washer> {

}
