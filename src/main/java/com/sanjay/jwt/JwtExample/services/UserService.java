package com.sanjay.jwt.JwtExample.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.sanjay.jwt.JwtExample.model.User;

@Service
public class UserService {
	
	List<User>users = new ArrayList<>();
	public UserService() {
		users.add(new User(UUID.randomUUID().toString(), "Sanjay", "mbsanjay@gmail"));
		users.add(new User(UUID.randomUUID().toString(), "Pankaj", "pankaj@gmail;"));
		users.add(new User(UUID.randomUUID().toString(), "satyam", "satyam@gmail"));
	}
	
	public List<User>getAllUsr(){
		return this.users;
	}
}
