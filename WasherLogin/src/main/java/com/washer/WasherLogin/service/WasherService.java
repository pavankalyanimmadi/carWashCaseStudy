package com.washer.WasherLogin.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washer.WasherLogin.pojo.Washer;
import com.washer.WasherLogin.repo.WasherRepo;



@Service
public class WasherService {
	
	@Autowired
	private WasherRepo washerRepo;
	
	
	public Washer login(Washer washer)
	{
		Washer existed=new Washer();
		existed.setLoginStatus(false);
		Optional<Washer> findExisted=washerRepo.findById(washer.getEmailId());
		if(findExisted.isPresent())
		{
			Washer temp=findExisted.get();
			if(temp.getPassword().contentEquals(washer.getPassword()))
			{
				existed= temp;
				existed.setLoginStatus(true);
				return existed;
			}
			}
		return existed;
	}
	
	
	

	

}
