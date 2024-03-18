package com.jwt.jwtExample.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.jwtExample.model.User;
import com.jwt.jwtExample.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
@Autowired
UserService userService;


	//http://localhost:8081/home/user
	@GetMapping("/user")
	public List<User> getUser() {
		return this.userService.getUser();

	}
	
	//to check which user is currently logged in
	@GetMapping("/current")
	public String getLoggedinUser(Principal principal) {
		return principal.getName();
		
	}
	//to add the user in table from postman
//	 @PostMapping("/add")
//	    public ResponseEntity<String> addUser(@RequestBody User user) {
//	        userService.addUser(user);
//	        return ResponseEntity.ok("User added successfully");
//	    }
}
