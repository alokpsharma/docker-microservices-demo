/**
 * 
 */
package com.alokpsharma.microservices.inventory.repository;

import java.util.List;

import com.alokpsharma.microservices.inventory.models.SecondaryCategory;
import com.alokpsharma.microservices.inventory.models.TertiaryCategory;
import org.springframework.data.repository.CrudRepository;

/**
 * @author hitjoshi
 *
 */
public interface TertiaryCategoryRepository extends CrudRepository<TertiaryCategory, Long> {

	public List<TertiaryCategory> findBySecondaryCategory(SecondaryCategory secondaryCategory);
	
}