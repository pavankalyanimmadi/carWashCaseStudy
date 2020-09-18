package com.washer.WasherSignup.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washer.WasherSignup.pojo.Washer;
import com.washer.WasherSignup.repo.WasherRepo;



@Service
public class WasherService {
	
	@Autowired
	private WasherRepo washerRepo;
	
	

	
	public Washer signup(Washer washer)
	{
		Washer temp=new Washer();
		temp.setRegistrationStatus(false);
		Optional<Washer> findExisted=washerRepo.findById(washer.getEmailId());
		if(findExisted.isPresent())
		{
			return temp;
		}
		else
		{
			temp=washerRepo.save(washer);
			temp.setRegistrationStatus(true);
			return temp;
		}
		
		
		
	}
	

	

}
