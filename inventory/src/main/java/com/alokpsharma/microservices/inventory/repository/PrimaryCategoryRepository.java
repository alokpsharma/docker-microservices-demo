/**
 * 
 */
package com.alokpsharma.microservices.inventory.repository;

import com.alokpsharma.microservices.inventory.models.PrimaryCategory;
import org.springframework.data.repository.CrudRepository;

/**
 * @author hitjoshi
 *
 */
public interface PrimaryCategoryRepository extends CrudRepository<PrimaryCategory, Long> {

}
