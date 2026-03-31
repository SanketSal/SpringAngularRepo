package com.rajtech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajtech.entities.Employee;
import com.rajtech.repositories.EmployeeRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class EmployeeController {
	@Autowired
	private EmployeeRepository repo;
	
	@GetMapping("/allemployees")
	public List<Employee> getAllEmployees(){
		return repo.findAll();
	}
}
//REST API to access Employee Service : http://localhost:8080/allemployees
