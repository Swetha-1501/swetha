package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class Controller {
	@Autowired
	private EmployeeRepo emprepo;
	
	
	@GetMapping("employees")
	public List<Employee> getAllEmployees(){
		return emprepo.findAll();
		
	}

}
