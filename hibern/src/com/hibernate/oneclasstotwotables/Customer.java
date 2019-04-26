package com.hibernate.oneclasstotwotables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

//Single class datas are store into two tables
//Automatically first table customerId value store into secondary table also
@Entity
@Table(name="Customer")//This is first table name
@SecondaryTable(name="CustomerDetails")//This is Secondary table value
public class Customer {	
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int creditScore;
	private int rewardPonits;	
	@Id
	@GeneratedValue
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	@Column(table="CustomerDetails")//Secondary table name
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Column(table="CustomerDetails")//Secondary table name
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	@Column(table="CustomerDetails")//Secondary table name
	public int getRewardPonits() {
		return rewardPonits;
	}
	public void setRewardPonits(int rewardPonits) {
		this.rewardPonits = rewardPonits;
	}

}
