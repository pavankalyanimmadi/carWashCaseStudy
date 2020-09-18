package com.AdminDeleteWashPackage;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.AdminDeleteWashPackage.pojo.WashPackage;
import com.AdminDeleteWashPackage.service.WashPackageService;

@Component
public class LambdaAdminDeltePackage implements Function<WashPackage, WashPackage> {
	
	@Autowired
	private WashPackageService service;

	@Override
	public WashPackage apply(WashPackage t) {
		return service.deletePackage(t);
	}

}
