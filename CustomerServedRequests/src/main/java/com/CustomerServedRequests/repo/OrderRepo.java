package com.CustomerServedRequests.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CustomerServedRequests.pojo.WashOrder;


@Repository
public interface OrderRepo extends MongoRepository<WashOrder, String> {

}
