package com.gl.employeeMgmtSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.employeeMgmtSystem.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	public Role findRoleByName(String name);
	
}
