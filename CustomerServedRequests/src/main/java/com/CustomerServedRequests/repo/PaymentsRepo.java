package com.CustomerServedRequests.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.CustomerServedRequests.pojo.Payment;




@Repository
public interface PaymentsRepo extends MongoRepository<Payment, String> {

}
