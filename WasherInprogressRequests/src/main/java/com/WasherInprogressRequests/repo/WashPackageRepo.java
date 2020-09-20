package com.WasherInprogressRequests.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.WasherInprogressRequests.pojo.WashPackage;


@Repository
public interface WashPackageRepo extends MongoRepository<WashPackage, String> {

}
