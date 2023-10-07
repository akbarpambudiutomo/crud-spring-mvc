/**
 * 
 */
package com.akbarcode.ums.service.impl;

import java.util.*;

import org.springframework.stereotype.Service;

import com.akbarcode.ums.entity.User;
import com.akbarcode.ums.repository.UserRepository;
import com.akbarcode.ums.service.UserService;

/**
 * @author
 *  Akbar Pambudi Utomo Oct 3, 2023 2:20:04 PM
 */

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	@Override
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).get();
	}
	
	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}

}
