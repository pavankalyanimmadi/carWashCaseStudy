package com.AdminDeleteWasher;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.AdminDeleteWasher.pojo.Washer;
import com.AdminDeleteWasher.service.WasherService;

@Component
public class LambdaAdminDeleteWasher implements Function<Washer, Washer> {
	
	@Autowired
	private WasherService service;

	@Override
	public Washer apply(Washer t) {
		return service.deleteWasher(t);
	}

}
