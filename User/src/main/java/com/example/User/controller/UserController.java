package com.example.User.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.User.Api.Department;
import com.example.User.Api.UserDepartment;
import com.example.User.model.User;
import com.example.User.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@Autowired
	UserDepartment userDepat;
	
	
	@Autowired
	 RestTemplate restTemplate;

	
	@PostMapping("/save")
	public User save(@RequestBody User user) {
		return service.save(user);
	}
	
	@GetMapping("/getDetail/{id}")
	public UserDepartment findDepartByUser(@PathVariable("id") int id) {
		User user=service.findByID(id);
		Department object=  restTemplate.getForObject("http://DEPARTMENT-SERIVE/department/getData/"+user.getDepartment(), Department.class);
		//UserDepartment ob=new UserDepartment();
		userDepat.setUser(user);
		userDepat.setDepart(object);
		return userDepat;
		
		  
		
	}
	 
}
