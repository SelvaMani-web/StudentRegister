package com.plot.system.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plot.system.entity.Qualification;
import com.plot.system.entity.Student;
import com.plot.system.service.StudentRegistrationService;

@RestController
@RequestMapping(value="/api")
public class StudentRegistrationController {
	
	@Autowired
	private StudentRegistrationService service;
	
	private static Map<Integer, Student> students=new HashMap<>();
	
	public StudentRegistrationController() {
		new Student("Rahul", new Date(), "degree", "sample address", "9494949494");
		
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return service.getAllStudent();
	}
	
	@GetMapping("/qualification")
	public List<Qualification> getAllQualification() {
		return service.getAllQualification();
	}
	
	@PostMapping("/store")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}

}
