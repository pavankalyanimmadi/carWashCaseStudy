package com.WasherAcceptingDeals.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.WasherAcceptingDeals.pojo.WashOrder;


@Repository
public interface WashOrderRepo extends MongoRepository<WashOrder, String> {

}
