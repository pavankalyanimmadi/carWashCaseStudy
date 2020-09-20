package com.CustomerServedRequests.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CustomerServedRequests.pojo.WashPackage;


@Repository
public interface WashPackageRepo extends MongoRepository<WashPackage, String> {

}
