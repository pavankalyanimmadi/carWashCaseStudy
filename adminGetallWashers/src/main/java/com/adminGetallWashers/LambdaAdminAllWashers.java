package com.adminGetallWashers;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adminGetallWashers.pojo.Washer;
import com.adminGetallWashers.service.WasherService;

@Component
public class LambdaAdminAllWashers implements Function<Object, List<Washer>> {
	
	@Autowired
	private WasherService service;

	@Override
	public List<Washer> apply(Object t) {
		return service.getAllWashers();
				
	}

}
