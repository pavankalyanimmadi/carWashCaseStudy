package com.washer.MainWasherService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washer.MainWasherService.pojo.Washer;
import com.washer.MainWasherService.repo.WasherRepo;




@Service
public class WasherService {
	
	@Autowired
	private WasherRepo washerRepo;
	
	
	public Washer login(Washer washer)
	{
		Optional<Washer> findExisted=washerRepo.findById(washer.getEmailId());
		if(findExisted.isPresent())
		{
			Washer temp=findExisted.get();
			if(temp.getPassword().contentEquals(washer.getPassword()))
			{
				return temp;
			}
			}
		return null;
	}
	
	public Washer signup(Washer washer)
	{
		Optional<Washer> findExisted=washerRepo.findById(washer.getEmailId());
		if(findExisted.isPresent())
		{
			return null;
		}
		else
		{
			return washerRepo.save(washer);
		}
		
		
		
	}
	
	
	public Washer updateProfile(Washer washer)
	{
		Optional<Washer> temp=washerRepo.findById(washer.getEmailId());
		if(temp.isPresent())
		{
			return washerRepo.save(washer);
			
		}
		return null;
				
		
		
	}
	
	public List<Washer> getAllWashers()
	{
		return washerRepo.findAll();
	}
	
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
