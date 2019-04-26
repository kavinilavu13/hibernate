package com.hibernate.twoclassestoonetable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
//Two class to one table (two class data can to store into single table)
public class School {
	private int schoolId;
	private String schoolName;
	//Create object of schooldetail in the school class 
	private SchoolDetails schoolDetails;
	
	//This is the Embedded class
	@Embedded
public SchoolDetails getSchoolDetails() {
		return schoolDetails;
	}
	public void setSchoolDetails(SchoolDetails schoolDetails) {
		this.schoolDetails = schoolDetails;
	}
@Id
@GeneratedValue
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
}
