package com.capstone.soar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.soar.entity.Cart;
import com.capstone.soar.entity.Inventory;
import com.capstone.soar.services.CartService;
import com.capstone.soar.services.InventoryService;

@RestController
public class CartController {

	@Autowired
	private InventoryService service;
	@Autowired
	private CartService cartService;
	@PostMapping(path="/addToCart")
	public Cart addCart(@RequestBody Cart cart) {
		return cartService.saveToCart(cart);
	}
	@DeleteMapping("/deleteItem/{cartId}")
	public void deleteCartItem(@PathVariable int cartId) {
		cartService.deleteCartItem(cartId);
	}
	

}
