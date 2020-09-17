package com.washpackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.washpackage.pojo.WashPackage;
import com.washpackage.service.WashPackageService;



@RestController
@CrossOrigin("*")
public class WashPackageController {
	
	@Autowired
	private WashPackageService packService;
	
	
	@GetMapping("/allpackages")
	public List<WashPackage> getAllPackages(){
		return packService.getAllPackages();
	}
	
	@PostMapping("/savepackage")
	public WashPackage savePackage(@RequestBody WashPackage pack) {
		System.out.println("in save package");
		 return packService.savePackage(pack);
		
	}
	
	@PostMapping("/deletepackage")
	public WashPackage deletePackage(@RequestBody WashPackage pack) {
		
		return packService.deletePackage(pack);
		
		
	}
	
	

}
