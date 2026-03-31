package com.rajtech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajtech.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,String>{

}
