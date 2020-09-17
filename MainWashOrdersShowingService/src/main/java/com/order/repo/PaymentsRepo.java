package com.order.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.order.pojo.Payment;




@Repository
public interface PaymentsRepo extends MongoRepository<Payment, String> {

}
