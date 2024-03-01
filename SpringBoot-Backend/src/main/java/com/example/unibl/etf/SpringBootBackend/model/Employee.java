package com.example.unibl.etf.SpringBootBackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 
 * 	@author Bosko Gogic
 * 	@version java 8
 * 
 * 	Class Employee represents model for table Employee with specific fields for one Employee.
 * 	In this class I met with java hibernate and java persistence api for the first time, so I 
 * 	put a lot of comments to help me when I get to new, further projects.
 *
 */

//NOTE - JP means java persistence

//NOTE - Lombok library
@Data 

//NOTE - Entity annotation specifies that the class is an entity. 
@Entity

//NOTE - Table annotation specifies the table in the database with which this entity is mapped.
@Table(name="employees")
public class Employee {
	
	// Generated value - To provide primary key.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	
	//To provide a specific column.
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	public Employee() {
		
	}

	public Employee(long id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
