package com.plot.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plot.system.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
