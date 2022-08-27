package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
