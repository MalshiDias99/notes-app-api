package com.example.demo.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.codec.digest.DigestUtils;





@Entity
public class UserDetails {
	
	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "password")
	private String password;
	
	

	public UserDetails() {
		
		super();
		UUID uuid = UUID.randomUUID();
		id = uuid.toString();
	}
	
	

	public UserDetails(String id, String name, String email, String gender, String password) {
		super();
		UUID uuid = UUID.randomUUID();
		id = uuid.toString();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		String sha256hex = DigestUtils.sha256Hex(password);
		this.password = sha256hex;
	}
	
	



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		String sha256hex = DigestUtils.sha256Hex(password);
		System.out.println("123");
		System.out.println(sha256hex);
		this.password = sha256hex;
	}
	
	
	
	
	
	

}
