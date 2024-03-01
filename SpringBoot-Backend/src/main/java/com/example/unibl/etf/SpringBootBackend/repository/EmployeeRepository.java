package com.example.unibl.etf.SpringBootBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.unibl.etf.SpringBootBackend.model.Employee;

/**
 * 
 * @author Bosko Gogic
 *
 */

// JpaRepository, nesto slicno kao i generic repository 
// U ovom slucaju T i ID, gdje je T genericka klasa (u nasem slucaju je to Employee) 
// i tip ID-a (U nasem slucaju to je Long)

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
