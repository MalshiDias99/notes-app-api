package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.UserDetails;
import com.example.demo.model.UserModel;
import com.example.demo.serviceImpl.UserServiceImplementation;
import com.todo.todorest.entity.User;
import com.todo.todorest.model.AuthenticatedUserModel;

@Controller
public class UserController {
	
	@Autowired
	UserServiceImplementation userService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/signup", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public UserDetails addUser(@RequestBody UserDetails user) {
		System.out.println(user.toString());
		return userService.addUser(user);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/user/login", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public UserDetails validateLogin(@RequestBody UserModel user) {
		System.out.println(user.getPassword());
		UserDetails userNew = userService.login(user);
		return userNew;
	}
	
	

}


