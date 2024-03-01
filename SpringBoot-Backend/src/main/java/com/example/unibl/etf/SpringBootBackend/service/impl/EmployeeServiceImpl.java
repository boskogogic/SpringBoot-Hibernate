package com.example.unibl.etf.SpringBootBackend.service.impl;

import org.springframework.stereotype.Service;

import com.example.unibl.etf.SpringBootBackend.model.Employee;
import com.example.unibl.etf.SpringBootBackend.repository.EmployeeRepository;
import com.example.unibl.etf.SpringBootBackend.service.EmployeeService;

/**
 * 
 * @author Bosko Gogic
 *
 */


/*Annotation that specifies Service.
* NOTE -> 1. There is Setter-based Dependency Injection
* 		  2. And there is Constructor-based Dependency Injection
*/
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	 
	/*
	 * If there is only one constructor you don't need to put @Auto annotation
	 * In other cases, you have to.
	 */
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
