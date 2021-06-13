package com.plot.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plot.system.dao.QualificationDAO;
import com.plot.system.dao.StudentDao;
import com.plot.system.entity.Qualification;
import com.plot.system.entity.Student;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService{

	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private QualificationDAO qualificationDao;
	
	
	@Override
	public List<Qualification> getAllQualification() {
		// TODO Auto-generated method stub
		return qualificationDao.findAll();
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}

}
