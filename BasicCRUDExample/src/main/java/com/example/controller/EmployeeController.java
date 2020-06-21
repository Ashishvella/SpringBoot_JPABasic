package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value="/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping(value="/")
	public String hello() {
		return "Cheater";
	}

	@GetMapping(value="/employee/{empid}")
	public Employee getEmployeeById(@PathVariable("empid") int empid) {
		return employeeService.getEmployeeById(empid);
	}
	
	@PostMapping(value="/employee")
	private int saveEmployee(@RequestBody Employee employee) {
		employeeService.saveOrUpdate(employee);
		return employee.getEmpid();
	}
}
