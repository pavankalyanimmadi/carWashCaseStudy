package com.washpackage.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.washpackage.pojo.WashPackage;



@Repository
public interface washPackageRepo extends MongoRepository<WashPackage, String> {

}
