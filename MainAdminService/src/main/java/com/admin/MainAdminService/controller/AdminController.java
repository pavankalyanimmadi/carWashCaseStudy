package com.admin.MainAdminService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.MainAdminService.pojo.Admin;
import com.admin.MainAdminService.service.AdminServiceMain;



@RestController
@CrossOrigin("*")
public class AdminController {
	
	@Autowired
	private AdminServiceMain adminService;
	
	@PostMapping("/adminlogin")
	public Admin login(@RequestBody Admin admin) {
		return adminService.adminLogin(admin);
		
	}
	
	
	@PostMapping("/adminsignup")
	public Admin signUp(@RequestBody Admin admin)
	{
		return adminService.signup(admin);
		
		
	}

}
