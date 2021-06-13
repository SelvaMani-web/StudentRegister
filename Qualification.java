package com.plot.system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student_qualification")
public class Qualification {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	private String name;
	
	
	public Qualification(String name) {
		super();
		this.name = name;
	}
	public Qualification(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
