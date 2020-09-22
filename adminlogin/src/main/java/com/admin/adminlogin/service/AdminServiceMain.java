package com.admin.adminlogin.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.adminlogin.pojo.Admin;
import com.admin.adminlogin.repo.AdminRepo;



@Service
public class AdminServiceMain {
	
	@Autowired
	private AdminRepo adminRepo;
	
	public Admin adminLogin(Admin admin) {
		Admin x=new Admin();
		x.setLoginStatus(false);
		
		Optional<Admin> existedUser = adminRepo.findById(admin.getEmailId());
		if(existedUser.isPresent())
		{
			Admin temp=existedUser.get();
			if(temp.getPassword().contentEquals(admin.getPassword()))
			{
				x= temp;
				x.setLoginStatus(true);
			}
		}
		return x;
		
		
	}
	
	
	

}
