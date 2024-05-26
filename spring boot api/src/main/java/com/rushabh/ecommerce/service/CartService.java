package com.rushabh.ecommerce.service;

import com.rushabh.ecommerce.modal.Cart;
import com.rushabh.ecommerce.modal.CartItem;
import com.rushabh.ecommerce.modal.User;
import com.rushabh.ecommerce.request.AddItemRequest;
import com.rushabh.ecommerce.exception.ProductException;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId, AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
