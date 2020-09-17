package com.order.MainOrderManagementService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.order.MainOrderManagementService.pojo.WashOrder;



@Repository
public interface WashOrderRepo extends MongoRepository<WashOrder, String> {

}
