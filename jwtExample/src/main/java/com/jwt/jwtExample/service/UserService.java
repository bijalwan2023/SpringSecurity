package com.jwt.jwtExample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.jwtExample.model.User;
import com.jwt.jwtExample.repository.UserRepository;


@Service
public class UserService {
	@Autowired
UserRepository userRepository;

List<User>store=new ArrayList<>();

public UserService() {
	store.add(new User(UUID.randomUUID().toString(),"Kavita","kavitabijalwan1@gmail.com"));
	store.add(new User(UUID.randomUUID().toString(),"Ayush","ayushbijalwan@gmail.com"));
	store.add(new User(UUID.randomUUID().toString(),"Nitin","nitinkhnaduri1@gmail.com"));

}
public List<User>getUser(){
	return this.store;
	
}

public void addUser(User user) {
	userRepository.save(user);
	
}
}
