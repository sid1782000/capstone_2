package com.capstone.soar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.soar.entity.Cart;
import com.capstone.soar.entity.Inventory;
import com.capstone.soar.repository.CartRepository;
import com.capstone.soar.repository.InventoryRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepo;
//	@Autowired
//	private InventoryRepository repository;
//	public void deleteEmployee(String item) {
//		cartRepo.delete(item);;
//	}
	public void deleteCartItem(int cartId) {
		cartRepo.deleteById(cartId);;
	}
	public Cart saveToCart(Cart cart) {
		if(cart.getCartId()==-1) {
		 cartRepo.save(cart);
		}else {
			Cart e= cartRepo.save(cart);
			e.setCartId(cart.getCartId());
		}
		return cart;
	}
}
