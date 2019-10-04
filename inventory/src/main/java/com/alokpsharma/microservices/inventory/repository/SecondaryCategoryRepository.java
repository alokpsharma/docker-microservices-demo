/**
 * 
 */
package com.alokpsharma.microservices.inventory.repository;

import java.util.List;

import com.alokpsharma.microservices.inventory.models.PrimaryCategory;
import com.alokpsharma.microservices.inventory.models.SecondaryCategory;
import org.springframework.data.repository.CrudRepository;

/**
 * @author hitjoshi
 *
 */
public interface SecondaryCategoryRepository extends CrudRepository<SecondaryCategory, Long> {

	public List<SecondaryCategory> findByPrimaryCategory(PrimaryCategory primaryCategory);
	
}
