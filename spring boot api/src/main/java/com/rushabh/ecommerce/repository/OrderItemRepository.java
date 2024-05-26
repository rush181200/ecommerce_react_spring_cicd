package com.rushabh.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rushabh.ecommerce.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
