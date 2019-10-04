package com.alokpsharma.microservices.invoice.repository;

import java.util.List;

import com.alokpsharma.microservices.invoice.models.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository  extends CrudRepository<Invoice, Long> {

	List<Invoice> findByCustomerId(Long customerId);
	   
}



