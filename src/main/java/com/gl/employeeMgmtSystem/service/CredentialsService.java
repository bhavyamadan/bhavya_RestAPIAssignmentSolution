package com.gl.employeeMgmtSystem.service;

import java.util.List;

import com.gl.employeeMgmtSystem.model.Role;
import com.gl.employeeMgmtSystem.model.User;

public interface CredentialsService {

	Role addNewRole(String name);

	User addNewUser(String username, String password, String role_name);
	
	List<Role> listAllRoles();
}