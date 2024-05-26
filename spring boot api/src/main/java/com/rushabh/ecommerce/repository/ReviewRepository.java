package com.rushabh.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rushabh.ecommerce.modal.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

	@Query("Select r from Rating r where r.product.id=:productId")
	public List<Review> getAllProductsReview(@Param("productId") Long productId);
}
