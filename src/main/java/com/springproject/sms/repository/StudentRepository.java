package com.springproject.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long >{
	
	
}
