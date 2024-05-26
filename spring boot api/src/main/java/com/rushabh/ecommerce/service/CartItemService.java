package com.rushabh.ecommerce.service;

import com.rushabh.ecommerce.modal.Cart;
import com.rushabh.ecommerce.modal.CartItem;
import com.rushabh.ecommerce.modal.Product;
import com.rushabh.ecommerce.exception.CartItemException;
import com.rushabh.ecommerce.exception.UserException;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
