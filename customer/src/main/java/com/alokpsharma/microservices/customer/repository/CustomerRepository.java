package com.alokpsharma.microservices.customer.repository;

import java.util.List;

import com.alokpsharma.microservices.customer.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;


public interface CustomerRepository  extends MongoRepository<Customer, String> {
	   List<Customer> findByMembershipId(Integer membershipId);
	   Customer findBy_id(ObjectId _id);

}



