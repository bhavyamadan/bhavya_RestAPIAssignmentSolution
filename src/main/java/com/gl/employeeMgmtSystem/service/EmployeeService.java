package com.gl.employeeMgmtSystem.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.gl.employeeMgmtSystem.model.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	Employee findById(int id);

	void deleteById(int id);

	void save(Employee employee);
	
	List<Employee> search(String firstName);
	
	List<Employee> findAllCustomSorted(Direction direction);

}