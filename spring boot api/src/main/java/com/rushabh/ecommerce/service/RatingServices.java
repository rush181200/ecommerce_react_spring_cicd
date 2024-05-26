package com.rushabh.ecommerce.service;

import java.util.List;

import com.rushabh.ecommerce.modal.Rating;
import com.rushabh.ecommerce.modal.User;
import com.rushabh.ecommerce.request.RatingRequest;
import com.rushabh.ecommerce.exception.ProductException;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req, User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
