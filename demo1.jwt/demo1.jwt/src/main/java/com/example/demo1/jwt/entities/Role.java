package com.example.demo1.jwt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo1.jwt.common.ERole;


import lombok.NoArgsConstructor;



@Entity
@Table(name = "role")
@NoArgsConstructor
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERole name;
	
	public Role(ERole name) {
		this.name = name;
	}
	
	public ERole getName() {
		return name;
	}
	
	public Integer getID() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setName(ERole name) {
		this.name = name;
	}
	
}
