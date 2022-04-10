package com.gl.employeeMgmtSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.employeeMgmtSystem.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User getUserByUsername(String username);
	
}
