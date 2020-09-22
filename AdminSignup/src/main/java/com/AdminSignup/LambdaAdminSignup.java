package com.AdminSignup;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.AdminSignup.pojo.Admin;
import com.AdminSignup.service.AdminServiceMain;

@Component
public class LambdaAdminSignup implements Function<Admin, Admin> {
	
	
	@Autowired
	private AdminServiceMain service;

	@Override
	public Admin apply(Admin t) {
		return service.signup(t);
	}

}
