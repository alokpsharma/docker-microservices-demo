/**
 * 
 */
package com.alokpsharma.microservices.invoice.repository;

import com.alokpsharma.microservices.invoice.models.ModeOfPay;
import org.springframework.data.repository.CrudRepository;

/**
 * @author hitjoshi
 *
 */
public interface ModeOfPayRepository extends CrudRepository<ModeOfPay, Long> {

}
