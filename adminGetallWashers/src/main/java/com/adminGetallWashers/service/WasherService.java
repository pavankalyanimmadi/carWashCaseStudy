package com.adminGetallWashers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminGetallWashers.pojo.Washer;
import com.adminGetallWashers.repo.WasherRepo;



@Service
public class WasherService {
	
	@Autowired
	private WasherRepo washerRepo;
	
	
	
	
	public List<Washer> getAllWashers()
	{
		return washerRepo.findAll();
	}
	
	
	

	

}
