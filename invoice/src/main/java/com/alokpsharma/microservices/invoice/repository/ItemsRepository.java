/**
 * 
 */
package com.alokpsharma.microservices.invoice.repository;

import java.util.List;

import com.alokpsharma.microservices.invoice.models.Invoice;
import com.alokpsharma.microservices.invoice.models.Items;
import org.springframework.data.repository.CrudRepository;

/**
 * @author hitjoshi
 *
 */
public interface ItemsRepository extends CrudRepository<Items, Long> {

	List<Items> findByInvoiceId(Invoice invoiceId);
}
