package com.student.service;

import org.springframework.stereotype.Service;

import com.student.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public Student getStudentDetail(String studentName) {
	
		Student student = new Student();
		
		student.setName(studentName);
		student.setStudentId("P12353");
		student.setContactNumber("+8743423242");
		
		return student;
	}

}
