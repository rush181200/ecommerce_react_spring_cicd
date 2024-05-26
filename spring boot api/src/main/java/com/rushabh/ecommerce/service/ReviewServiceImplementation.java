package com.rushabh.ecommerce.service;

import java.time.LocalDateTime;
import java.util.List;

import com.rushabh.ecommerce.modal.Product;
import com.rushabh.ecommerce.modal.Review;
import com.rushabh.ecommerce.modal.User;
import com.rushabh.ecommerce.repository.ProductRepository;
import com.rushabh.ecommerce.repository.ReviewRepository;
import com.rushabh.ecommerce.request.ReviewRequest;
import org.springframework.stereotype.Service;

import com.rushabh.ecommerce.exception.ProductException;

@Service
public class ReviewServiceImplementation implements ReviewService {
	
	private ReviewRepository reviewRepository;
	private ProductService productService;
	private ProductRepository productRepository;
	
	public ReviewServiceImplementation(ReviewRepository reviewRepository,ProductService productService,ProductRepository productRepository) {
		this.reviewRepository=reviewRepository;
		this.productService=productService;
		this.productRepository=productRepository;
	}

	@Override
	public Review createReview(ReviewRequest req, User user) throws ProductException {
		// TODO Auto-generated method stub
		Product product=productService.findProductById(req.getProductId());
		Review review=new Review();
		review.setUser(user);
		review.setProduct(product);
		review.setReview(req.getReview());
		review.setCreatedAt(LocalDateTime.now());
		
//		product.getReviews().add(review);
		productRepository.save(product);
		return reviewRepository.save(review);
	}

	@Override
	public List<Review> getAllReview(Long productId) {
		
		return reviewRepository.getAllProductsReview(productId);
	}

}
