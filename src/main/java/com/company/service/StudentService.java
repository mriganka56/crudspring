package com.company.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.company.entity.Student;

@Component
public interface StudentService {
	Student saveEntity(Student params);

	List<Student> getAllEntity();

	Student getAnEntity(int id);

	Student updateEntity(Student params, int id);

	String deleteEntity(int id);

}
