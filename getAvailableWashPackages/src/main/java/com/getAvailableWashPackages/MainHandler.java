package com.getAvailableWashPackages;

import java.util.List;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.getAvailableWashPackages.pojo.WashPackage;

public class MainHandler extends SpringBootRequestHandler<Object, List<WashPackage>>{

}
