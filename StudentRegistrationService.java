package com.plot.system.service;

import java.util.List;

import com.plot.system.entity.Qualification;
import com.plot.system.entity.Student;


public interface StudentRegistrationService {
	
	List<Qualification> getAllQualification();
	
    List<Student> getAllStudent();
	
	Student saveStudent(Student student);
	

}
