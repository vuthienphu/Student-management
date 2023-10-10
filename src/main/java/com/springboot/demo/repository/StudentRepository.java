package com.springboot.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;


import com.springboot.demo.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

@Query("SELECT s FROM Student s")
List<Student> myFindAllStudentts();

}
