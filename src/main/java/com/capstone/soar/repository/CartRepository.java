package com.capstone.soar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.soar.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

}
