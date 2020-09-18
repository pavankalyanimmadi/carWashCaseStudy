package com.getAvailableWashPackages.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getAvailableWashPackages.pojo.WashPackage;
import com.getAvailableWashPackages.repo.washPackageRepo;


@Service
public class WashPackageService {
	
	@Autowired
	private washPackageRepo repo;
	
	public List<WashPackage> getAllPackages() {
		
		return repo.findAll();
		
	}
	
	
	
	
	

}
