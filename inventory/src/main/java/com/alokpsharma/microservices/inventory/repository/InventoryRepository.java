package com.alokpsharma.microservices.inventory.repository;

import com.alokpsharma.microservices.inventory.models.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository  extends CrudRepository<Inventory, Long> {
	   
}



