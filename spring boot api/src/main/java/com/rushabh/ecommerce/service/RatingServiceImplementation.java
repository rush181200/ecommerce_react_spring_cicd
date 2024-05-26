package com.rushabh.ecommerce.service;

import java.time.LocalDateTime;
import java.util.List;

import com.rushabh.ecommerce.modal.Product;
import com.rushabh.ecommerce.modal.Rating;
import com.rushabh.ecommerce.modal.User;
import com.rushabh.ecommerce.repository.RatingRepository;
import com.rushabh.ecommerce.request.RatingRequest;
import org.springframework.stereotype.Service;

import com.rushabh.ecommerce.exception.ProductException;

@Service
public class RatingServiceImplementation implements RatingServices{
	
	private RatingRepository ratingRepository;
	private ProductService productService;
	
	public RatingServiceImplementation(RatingRepository ratingRepository,ProductService productService) {
		this.ratingRepository=ratingRepository;
		this.productService=productService;
	}

	@Override
	public Rating createRating(RatingRequest req, User user) throws ProductException {
		
		Product product=productService.findProductById(req.getProductId());
		
		Rating rating=new Rating();
		rating.setProduct(product);
		rating.setUser(user);
		rating.setRating(req.getRating());
		rating.setCreatedAt(LocalDateTime.now());
		
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getProductsRating(Long productId) {
		// TODO Auto-generated method stub
		return ratingRepository.getAllProductsRating(productId);
	}
	
	

}
