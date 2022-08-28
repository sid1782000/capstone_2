package com.capstone.soar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.soar.entity.Inventory;
import com.capstone.soar.services.InventoryService;

@RestController
public class InventoryController {
		
		@Autowired
		private InventoryService service;
		
		@GetMapping(path="/inventory")
		public List<Inventory>retrieveAllInventory(){
			return service.findAllInventory();
		}
		
		@PostMapping(path="/addInventory")
		public Inventory addEmployee(@RequestBody Inventory inventory) {
			return service.saveInventory(inventory);
		}
}


//"name":"drillbit",
//"type":"metal",
//"cost":100,
//"itemCount":1,
//"pathToImage":"path/url"