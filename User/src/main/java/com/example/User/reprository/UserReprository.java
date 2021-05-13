package com.example.User.reprository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.User.model.User;

public interface UserReprository  extends JpaRepository<User, Integer>{

}
