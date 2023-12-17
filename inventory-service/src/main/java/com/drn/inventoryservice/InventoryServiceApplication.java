package com.drn.inventoryservice;

import com.drn.inventoryservice.model.Inventory;
import com.drn.inventoryservice.repository.InventoryRepository;
import com.drn.inventoryservice.service.InventoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory = Inventory.builder()
					.skuCode("iphone_13")
					.quantity(100)
					.build();

			Inventory inventory1 = Inventory.builder()
					.skuCode("iphone_13_red")
					.quantity(0)
					.build();

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	}

}
