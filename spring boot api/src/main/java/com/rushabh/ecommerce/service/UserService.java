package com.rushabh.ecommerce.service;

import java.util.List;

import com.rushabh.ecommerce.modal.User;
import com.rushabh.ecommerce.exception.UserException;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
