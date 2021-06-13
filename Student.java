package com.plot.system.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student_registration")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	private String name;
	private Date dob;
	private String qualification;
	private String address;
	private String mobile;
	
	public Student() {
		super();
	}
	
	public Student(String name, Date dob, String qualification, String address, String mobile) {
		super();
		this.name = name;
		this.dob = dob;
		this.qualification = qualification;
		this.address = address;
		this.mobile = mobile;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	

}
