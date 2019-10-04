package com.alokpsharma.microservices.customer.repository;

import java.util.List;

import com.alokpsharma.microservices.customer.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository  extends CrudRepository<Customer, Long> {
	   List<Customer> findByCustomerName(String customerName); 

}



