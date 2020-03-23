package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.UserDetails;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.todo.todorest.entity.User;
import com.todo.todorest.entity.UserRegistrationDetails;
import com.todo.todorest.repository.UserRegistrationRepository;


@Service
public class UserServiceImplementation implements UserService{

	@Autowired 
	UserRepository userRepository;
	
	@Override
	public UserDetails addUser(UserDetails user) {
		System.out.println("test");
		return userRepository.save(user);
	}

	@Override
	public UserDetails login(UserModel user) {
		return userRepository.getUserByUsernameAndPassword(user.getEmail(), user.getPassword());
	}
	
	


}
