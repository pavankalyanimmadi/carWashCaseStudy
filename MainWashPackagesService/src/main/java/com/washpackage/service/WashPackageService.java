package com.washpackage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washpackage.pojo.WashPackage;
import com.washpackage.repo.washPackageRepo;



@Service
public class WashPackageService {
	
	@Autowired
	private washPackageRepo repo;
	
	public List<WashPackage> getAllPackages() {
		
		return repo.findAll();
		
	}
	
	
	public WashPackage savePackage(WashPackage pack) {
		return repo.save(pack);
		
		
	}
	
	public WashPackage deletePackage(WashPackage pack)
	{
		Optional<WashPackage> existed= repo.findById(pack.getPackageID());
		if(existed.isPresent())
		{
			 repo.deleteById(pack.getPackageID());
			 return pack;
			
		}
		return null;
		 
		
	}
	
	

}
