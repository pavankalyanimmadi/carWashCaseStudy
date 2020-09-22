package com.AdminSignup.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdminSignup.pojo.Admin;
import com.AdminSignup.repo.AdminRepo;




@Service
public class AdminServiceMain {
	
	@Autowired
	private AdminRepo adminRepo;
	
	
	
	public Admin signup(Admin admin) {
		
		Admin temp=new Admin();
		temp.setRegistrationStatus(false);
		
		Optional<Admin> existed=adminRepo.findById(admin.getEmailId());
		
		if(existed.isPresent())
		{
			return temp;
		}
		
		
		
		temp= adminRepo.save(admin);
		temp.setRegistrationStatus(true);
		return temp;
		
		
		
	}
	

}
