package com.hibernate.twoclassestoonetable;

import javax.persistence.Embeddable;

//Dont create Entity  bec if its entity it will create one more table
@Embeddable
public class SchoolDetails {
	
	private String schoolAddress;
	private boolean isPublicSchool;
	private int studentCount;
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public boolean isPublicSchool() {
		return isPublicSchool;
	}
	public void setPublicSchool(boolean isPublicSchool) {
		this.isPublicSchool = isPublicSchool;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	

}
