package com.example.demo1.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.jwt.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
	/**
	*Find user by user name
	*@param username
	 *@return User
	*/
	Optional<User>findByUsername(String username);
	/**
	*Check exists an user by user name
	*@param username
	*@return Boolean
	*/
	Boolean existsByUsername(String username);
	/**
	*Check exists an user email
	 @param email
	*@return Boolean
	*/
	Boolean existsByEmail(String email);

}
