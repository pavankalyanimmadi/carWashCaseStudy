package com.AdminDeleteWashPackage.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AdminDeleteWashPackage.pojo.WashPackage;


@Repository
public interface washPackageRepo extends MongoRepository<WashPackage, String> {

}
