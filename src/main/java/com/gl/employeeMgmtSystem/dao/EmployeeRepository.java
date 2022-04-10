package com.gl.employeeMgmtSystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.employeeMgmtSystem.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);
	
}
