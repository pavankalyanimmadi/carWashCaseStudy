package com.AdminSignup.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AdminSignup.pojo.Admin;


@Repository
public interface AdminRepo extends MongoRepository<Admin, String> {

}
