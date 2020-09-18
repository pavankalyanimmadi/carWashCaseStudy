package com.getAvailableWashPackages;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.getAvailableWashPackages.pojo.WashPackage;
import com.getAvailableWashPackages.service.WashPackageService;

@Component
public class LambdaAvailablePackages implements Function<Object, List<WashPackage>> {
	
	@Autowired
	private WashPackageService service;

	@Override
	public List<WashPackage> apply(Object t) {
		return service.getAllPackages();
	}

}
