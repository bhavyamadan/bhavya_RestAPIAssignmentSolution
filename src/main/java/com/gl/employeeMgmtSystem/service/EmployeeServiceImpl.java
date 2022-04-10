package com.gl.employeeMgmtSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.gl.employeeMgmtSystem.dao.EmployeeRepository;
import com.gl.employeeMgmtSystem.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public List<Employee> findAll() {
		return empRepository.findAll();
	}
	
	@Override
	public Employee findById(int id) {
		return empRepository.findById(id).get();
	}
	
	@Override
	public void deleteById(int id) {
		empRepository.deleteById(id);
	}
	
	@Override
	public void save(Employee employee) {
		empRepository.save(employee);
	}

	@Override
	public List<Employee> search(String firstName) {
		return empRepository.findByFirstNameContainsAllIgnoreCase(firstName);
	}

	@Override
	public List<Employee> findAllCustomSorted(Direction order) {
		return empRepository.findAll(Sort.by(order, "firstName"));
	}

}
