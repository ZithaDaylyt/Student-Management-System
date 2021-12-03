package com.springproject.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springproject.sms.entity.Student;
import com.springproject.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManangementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManangementSystemApplication.class, args);
	}
	
	//Run when we execute spring boot app
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1 = new Student("Ts", "Zitha", "ts@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Zingah", "Smith", "zingah@icloud.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Daylyt", "Cumbell", "day@yahoo.com");
//		studentRepository.save(student3);
		
	}

}
 