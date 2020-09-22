package com.admin.adminlogin.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.admin.adminlogin.pojo.WashPackage;

@Repository
public interface PackageRepo extends MongoRepository<WashPackage, String>{

}
