package com.gl.employeeMgmtSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.gl.employeeMgmtSystem.dao.UserRepository;
import com.gl.employeeMgmtSystem.model.User;
import com.gl.employeeMgmtSystem.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.getUserByUsername(username);
		
		if (user == null)
			throw new UsernameNotFoundException("Username not valid!");
		
		return new MyUserDetails(user);
	}

}
