package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserDetails;

@Repository
public interface UserRepository extends CrudRepository<UserDetails, Integer>{
	
	@Query(value = "SELECT * FROM USER_DETAILS WHERE EMAIL = (:email) AND PASSWORD = (:password)", nativeQuery = true)
	public UserDetails getUserByUsernameAndPassword(@Param("email") String email, @Param("password") String password);


}

