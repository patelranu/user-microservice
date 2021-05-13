package com.example.User.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.User.model.User;
import com.example.User.reprository.UserReprository;

@Service
public class UserService {
	
	@Autowired
	UserReprository repo;

	public User save(User user) {
		return repo.save(user);
	}

	public User findByID(int id) {
		  return repo.findById(id).orElse(null);
	}

}
