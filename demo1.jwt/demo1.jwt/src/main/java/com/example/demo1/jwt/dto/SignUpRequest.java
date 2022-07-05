package com.example.demo1.jwt.dto;

import java.util.Set;

import com.example.demo1.jwt.entities.Role;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class SignUpRequest {
	
	private String name;
	private String password;
	private String email;
	private Set<Role> role;

}
