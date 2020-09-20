package com.WasherServedRequests.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.WasherServedRequests.pojo.WashOrder;


@Repository
public interface OrderRepo extends MongoRepository<WashOrder, String> {

}
