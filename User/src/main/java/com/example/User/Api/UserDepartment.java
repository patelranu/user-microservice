package com.example.User.Api;

import org.springframework.stereotype.Component;

import com.example.User.model.User;

@Component
public class UserDepartment {
	private User user;
	private Department depart;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDepart() {
		return depart;
	}
	public void setDepart(Department depart) {
		this.depart = depart;
	}
	public UserDepartment() {
		super();
	}
	
	

}
