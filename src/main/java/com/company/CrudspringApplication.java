package com.company;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.company.entity.Student;
import com.company.service.StudentService;

@SpringBootApplication
public class CrudspringApplication {

	@Autowired
	public StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(CrudspringApplication.class, args);
	}

	@PostConstruct
	public void demo() {
		Student s1 = new Student();
		s1.setName("Mriganka");
		s1.setId(1);
		s1.setAddress("Behala, Kolkata");
		studentService.saveEntity(s1);
	}
}
