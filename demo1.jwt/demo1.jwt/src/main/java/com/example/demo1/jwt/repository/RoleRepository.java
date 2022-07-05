package com.example.demo1.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.jwt.common.ERole;
import com.example.demo1.jwt.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{
	 /**
     *Find role by name
     *@param name
     *@return Role
     */
    
	Optional<Role>findByName(ERole name);
}
   