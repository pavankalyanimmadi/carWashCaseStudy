package com.washer.WasherSignup;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.washer.WasherSignup.pojo.Washer;
import com.washer.WasherSignup.service.WasherService;

@Component
public class WasherSIgnupLambda implements Function<Washer, Washer> {
	
	@Autowired
	private WasherService service;

	@Override
	public Washer apply(Washer t) {
		return service.signup(t);
		
	}

}
