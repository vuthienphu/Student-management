package com.springboot.demo.service;

import java.util.List;

import com.springboot.demo.entity.Student;

public interface StudentService {
	
List<Student> getAllStudent();

Student saveStudent(Student student);

Student getStudentById(long id);

Student updateStudent(Student student);

void deleteStudentById(long id);

}
