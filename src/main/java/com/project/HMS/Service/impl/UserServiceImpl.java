package com.project.HMS.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.project.HMS.Repository.UserRepository;
import com.project.HMS.Entity.User;
import com.project.HMS.Service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
