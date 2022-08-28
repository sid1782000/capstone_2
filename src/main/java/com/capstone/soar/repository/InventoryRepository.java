package com.capstone.soar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.soar.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Integer>{

}
