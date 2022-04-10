package com.gl.employeeMgmtSystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.gl.employeeMgmtSystem.dao.UserRepository;
import com.gl.employeeMgmtSystem.model.Role;
import com.gl.employeeMgmtSystem.model.User;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setId(1);
		user.setUsername("admin");
		user.setPassword(new BCryptPasswordEncoder().encode("admin123"));
		List<Role> roles = new ArrayList<>();
		roles.add(new Role(1,"ADMIN"));
		user.setListOfRoles(roles);
		userRepository.save(user);
	}

}
