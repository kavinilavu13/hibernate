package com.hibernate.chapter1;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
//present in javax.persistence
@Table(name="EmployeeInfo") //if it is not this  line mentioned it automatically take class name as table name
public class Employee {
	private int empId;
	private String empName;
	private String empPassword;
	private String empEmailAddress;
	private boolean isPersent;
	private Calendar empJoinDate;
	private Date empLongTime;
	
	@Transient//cannot store particular column  in a table
	public String getEmpPassword() {
		return empPassword;
	}
	
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	
	@Column(nullable=false)//if wants to not null column can mention nullable=false
	public String getEmpEmailAddress() {
		return empEmailAddress;
	}
	public void setEmpEmailAddress(String empEmailAddress) {
		this.empEmailAddress = empEmailAddress;
	}
	
	@Basic//this is default annotation 
	public boolean isPersent() {
		return isPersent;
	}
	public void setPersent(boolean isPersent) {
		this.isPersent = isPersent;
	}
	
	@Temporal(TemporalType.DATE)//can change datatype is  date 
	public Calendar getEmpJoinDate() {
		return empJoinDate;
	}
	public void setEmpJoinDate(Calendar empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)//can change datatype is  time 
	public Date getEmpLongTime() {
		return empLongTime;
	}
	public void setEmpLongTime(Date empLongTime) {
		this.empLongTime = empLongTime;
	}
	@Id
//	@GeneratedValue//generator
	@TableGenerator(name="empid",table="emppktb", pkColumnName="empkey",pkColumnValue="empvalue",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.TABLE,generator="empid")
	@Column(name="EmployeeId")//here instead of empId column name can override the column name 
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}
