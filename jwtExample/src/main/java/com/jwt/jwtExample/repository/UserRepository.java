package com.jwt.jwtExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.jwtExample.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, String>{

	
}
