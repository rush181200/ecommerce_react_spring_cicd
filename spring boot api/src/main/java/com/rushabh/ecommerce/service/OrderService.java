package com.rushabh.ecommerce.service;

import java.util.List;

import com.rushabh.ecommerce.modal.Address;
import com.rushabh.ecommerce.modal.Order;
import com.rushabh.ecommerce.modal.User;
import com.rushabh.ecommerce.exception.OrderException;

public interface OrderService {
	
	public Order createOrder(User user, Address shippingAdress);
	
	public Order findOrderById(Long orderId) throws OrderException;
	
	public List<Order> usersOrderHistory(Long userId);
	
	public Order placedOrder(Long orderId) throws OrderException;
	
	public Order confirmedOrder(Long orderId)throws OrderException;
	
	public Order shippedOrder(Long orderId) throws OrderException;
	
	public Order deliveredOrder(Long orderId) throws OrderException;
	
	public Order cancledOrder(Long orderId) throws OrderException;
	
	public List<Order>getAllOrders();
	
	public void deleteOrder(Long orderId) throws OrderException;
	
}
