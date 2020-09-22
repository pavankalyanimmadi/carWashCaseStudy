package com.AdminDeleteWasher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdminDeleteWasher.pojo.Washer;
import com.AdminDeleteWasher.repo.WasherRepo;



@Service
public class WasherService {
	
	@Autowired
	private WasherRepo washerRepo;
	
	
	
	
	public Washer deleteWasher(Washer washer)
	{
		Optional<Washer> temp=washerRepo.findById(washer.getEmailId());
		if(temp.isPresent())
			
		{
			Washer existed=temp.get();
			washerRepo.delete(existed);
			return existed;
		}
		return null;
		
	}
	

	

}
