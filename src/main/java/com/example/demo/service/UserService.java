package com.example.demo.service;

import com.example.demo.entity.UserDetails;
import com.example.demo.model.UserModel;


public interface UserService {

	public UserDetails addUser(UserDetails user);
	
	public UserDetails login(UserModel user);
}
