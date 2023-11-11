package com.sanjay.jwt.JwtExample.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.jwt.JwtExample.model.User;
import com.sanjay.jwt.JwtExample.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserService userService;
	
//	@GetMapping("/user")
//	public List<User> getUser() {
//		System.out.println("Getting User");
//		return userService.getAllUsr();
//	}
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getUser() {
		System.out.println("Getting User");
		return ResponseEntity.ok(userService.getAllUsr());
	}
	
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}
	
	
}
