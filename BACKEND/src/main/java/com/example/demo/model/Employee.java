package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="cellNo")
	private long cellNo;
	
	@Column(name="email")
	private String email;
	
	
	public Employee() {
		
	}
	
	public Employee(long id,String name, long cellNo, String email) {
		super();
		this.name = name;
		this.cellNo = cellNo;
		this.email = email;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCellNo() {
		return cellNo;
	}

	public void setCellNo(long cellNo) {
		this.cellNo = cellNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
