package com.admin.adminlogin.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.admin.adminlogin.pojo.Admin;

@Repository
public interface AdminRepo extends MongoRepository<Admin, String> {

}
