package com.washer.WasherLogin;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.washer.WasherLogin.pojo.Washer;
import com.washer.WasherLogin.service.WasherService;

@Component
public class WasherloginLambda implements Function<Washer, Washer> {
	
	@Autowired
	private WasherService service;

	@Override
	public Washer apply(Washer t) {
		return service.login(t);
		
	}

}
