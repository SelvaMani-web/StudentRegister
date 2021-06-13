package com.plot.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plot.system.entity.Qualification;

public interface QualificationDAO extends JpaRepository<Qualification, Integer> {

}
