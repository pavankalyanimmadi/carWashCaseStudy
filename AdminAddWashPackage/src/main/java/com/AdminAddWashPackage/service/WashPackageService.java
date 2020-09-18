package com.AdminAddWashPackage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdminAddWashPackage.pojo.WashPackage;
import com.AdminAddWashPackage.repo.washPackageRepo;


@Service
public class WashPackageService {
	
	@Autowired
	private washPackageRepo repo;
	
	
	
	
	public WashPackage savePackage(WashPackage pack) {
		WashPackage temp=new WashPackage();
		
		
		temp= repo.save(pack);
		temp.setPackageAdded(true);
		return temp;
		
		
	}
	
	
	
	

}
