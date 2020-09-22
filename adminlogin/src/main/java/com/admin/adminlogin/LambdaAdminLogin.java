package com.admin.adminlogin;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.admin.adminlogin.pojo.Admin;
import com.admin.adminlogin.service.AdminServiceMain;

@Component
public class LambdaAdminLogin implements Function<Admin, Admin> {
	
	@Autowired
	private AdminServiceMain service;

	@Override
	public Admin apply(Admin t) {
		return service.adminLogin(t);
	}

}
