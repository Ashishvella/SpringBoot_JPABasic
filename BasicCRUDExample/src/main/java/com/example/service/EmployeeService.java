package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		List<Employee> employees= new ArrayList<>();
		employeeRepository.findAll().forEach(employees1 -> employees.add(employees1));
		return employees;
	}
		
	public void saveOrUpdate(Employee employee) {
		employeeRepository.save(employee);
		}
	
	public Employee getEmployeeById(Integer id) {
		return employeeRepository.findById(id).get();	
	}
	
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}
	
}
