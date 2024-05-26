package com.rushabh.ecommerce.service;

import java.util.List;

import com.rushabh.ecommerce.modal.Review;
import com.rushabh.ecommerce.modal.User;
import com.rushabh.ecommerce.request.ReviewRequest;
import com.rushabh.ecommerce.exception.ProductException;

public interface ReviewService {

	public Review createReview(ReviewRequest req, User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
