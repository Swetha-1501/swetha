package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;



@SpringBootApplication
public class SpringbootApp1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApp1Application.class, args);
	}
	@Autowired
	EmployeeRepo emprepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		this.emprepo.save(new Employee(1,"nigam",888889999,"nigam@gmail.com"));
		this.emprepo.save(new Employee(2,"niru",888779999,"nirum@gmail.com"));
		
	}
	
	}
