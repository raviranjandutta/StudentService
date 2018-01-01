package com.student.controller;



import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	

	@GetMapping("/api/v1/studentdetails/{studentName}")
	public @ResponseBody ResponseEntity<Student> getStudentDetail(@PathVariable String studentName) {
		
		Student student = studentService.getStudentDetail(studentName);
		
		
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
		
		
	}
}
