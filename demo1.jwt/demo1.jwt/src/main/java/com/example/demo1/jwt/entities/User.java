package com.example.demo1.jwt.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users",uniqueConstraints={@UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames="email")})
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	private String email;
	

	private String password;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="user_roles",joinColumns=@JoinColumn(name="user_id")
	           ,inverseJoinColumns=@JoinColumn(name="role_id"))
	private Set<Role>roles=new HashSet<>();
	
	
	public Set<Role> getRoles () {
		return roles;
	}
	
	public void setRoles (Set<Role> roles) {
		this.roles = roles;
	}
	
	
}
