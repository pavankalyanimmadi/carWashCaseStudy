package com.admin.MainAdminService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.admin.MainAdminService.pojo.Admin;



@Repository
public interface AdminRepo extends MongoRepository<Admin, String> {

}
