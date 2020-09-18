package com.AdminDeleteWashPackage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdminDeleteWashPackage.pojo.WashPackage;
import com.AdminDeleteWashPackage.repo.washPackageRepo;


@Service
public class WashPackageService {
	
	@Autowired
	private washPackageRepo repo;
	
	
	
	public WashPackage deletePackage(WashPackage pack)
	{
		WashPackage temp=new WashPackage();
		temp.setPackageDeleted(false);
		
		Optional<WashPackage> existed= repo.findById(pack.getPackageID());
		if(existed.isPresent())
		{
			repo.deleteById(pack.getPackageID());
			temp.setPackageDeleted(true);
			return temp;
		}
		return temp;
		 
		
	}
	
	

}
