package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entity.Student;
import com.company.exception.StudentException;
import com.company.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveEntity(Student params) {

		return studentRepository.save(params);

	}

	@Override
	public List<Student> getAllEntity() {

		return studentRepository.findAll();
	}

	@Override
	public Student getAnEntity(int id) {

		return studentRepository.findById(id)
				.orElseThrow(() -> new StudentException("Student with id " + id + " Not Found!!!!!"));

	}

	@Override
	public Student updateEntity(Student params, int id) {
		// TODO Auto-generated method stub
		Student s = studentRepository.findById(id).get();
		s.setName(params.getName());
		s.setAddress(params.getAddress());
		return studentRepository.save(s);
	}

	@Override
	public String deleteEntity(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "User with id " + id + " has been deleted!!!!";
	}

}
