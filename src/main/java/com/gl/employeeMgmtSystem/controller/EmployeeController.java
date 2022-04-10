package com.gl.employeeMgmtSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.employeeMgmtSystem.model.Employee;
import com.gl.employeeMgmtSystem.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("")
	public String home() {
		return "Hello Users !"+System.lineSeparator()+"Welcome to Employee Management Portal.";
	}
	
	@GetMapping("/")
	public List<Employee> list() {
		return employeeService.findAll();
	}
	
	@PostMapping("/add")
	public Employee add(Employee employee) {
		employeeService.save(employee);
		return employeeService.findById(employee.getId());
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		employeeService.deleteById(id);
		return String.format("Deleted employee id - %d", id);
	}
	
	@GetMapping("/{id}")
	public Employee getById(@PathVariable int id) {
		return employeeService.findById(id);
	}
	
	@PostMapping("/update")
	public Employee update(Employee employee) {
		employeeService.save(employee);
		return employeeService.findById(employee.getId());
	}
	
	@GetMapping("/search/{firstname}")
	public List<Employee> search(@PathVariable String firstname) {
		return employeeService.search(firstname);
	}
	
	@GetMapping("/sort")
	public List<Employee> getSortedList(Direction order) {
		return employeeService.findAllCustomSorted(order);
	}
	
}






