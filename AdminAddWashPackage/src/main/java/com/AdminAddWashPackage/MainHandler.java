package com.AdminAddWashPackage;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.AdminAddWashPackage.pojo.WashPackage;

public class MainHandler extends SpringBootRequestHandler<WashPackage, WashPackage> {

}
