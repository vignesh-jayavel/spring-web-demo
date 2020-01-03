package com.freshworks.training.springwebdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebDemoApplication.class, args);
	}

	@Autowired EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello world");
		for (EmployeeEntity employeeEntity :
						employeeRepository.findAll()) {
			System.out.println(employeeEntity.name);
		}

	}
}
