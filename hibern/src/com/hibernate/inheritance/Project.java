package com.hibernate.inheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//multiplelevel inheritance
//the class and the table

//Inheitance type
//1.SINGLE_TABLE(default)
//2.JOINED
//3.TABLE_PER_CLASS
@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)//single table
//@Inheritance(strategy=InheritanceType.JOINED)//create table
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Project {

	private int projectId;
	private String projectName;
	@Id
	@GeneratedValue
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
}
