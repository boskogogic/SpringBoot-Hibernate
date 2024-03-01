package com.example.unibl.etf.SpringBootBackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unibl.etf.SpringBootBackend.model.Employee;
import com.example.unibl.etf.SpringBootBackend.service.EmployeeService;

/**
 * 
 * @author Bosko Gogic
 * @version java 8
 * 
 */

/**
 * @RestController connecting Controller and ResponseBody
 * annotation, so If you put this annotation, you dont need  
 * to put the other two.
 * 
 * @RequestMapping creates base URL for this controller.
 */
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	/**Method that create Employee - RestAPI
	 * @PostMapping
	 * Annotation which specifies type  of request.
	 * @RequestBody
	 * Annotation allows us to retrieve the request's body
	 * and automatically convert it to Java Object
	 * @param employee
	 * @return model and http status code CREATED
	 */
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
		
	}
	
	

}
