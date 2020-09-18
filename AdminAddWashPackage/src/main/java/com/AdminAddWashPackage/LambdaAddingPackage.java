package com.AdminAddWashPackage;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.AdminAddWashPackage.pojo.WashPackage;
import com.AdminAddWashPackage.service.WashPackageService;

@Component
public class LambdaAddingPackage implements Function<WashPackage, WashPackage> {
	
	@Autowired
	private WashPackageService service;

	@Override
	public WashPackage apply(WashPackage t) {
		return service.savePackage(t);
	}

}
