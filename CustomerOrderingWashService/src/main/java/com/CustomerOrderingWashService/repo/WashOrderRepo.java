package com.CustomerOrderingWashService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CustomerOrderingWashService.pojo.WashOrder;


@Repository
public interface WashOrderRepo extends MongoRepository<WashOrder, String> {

}
