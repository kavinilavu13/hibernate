package com.hibernate.compoundkey;

import javax.persistence.Entity;
import javax.persistence.Id;

//here how to single table make two primary key 
//here userId and accoundId id wants to make primary key
//Compoundkey class is implements the Serializable
@Entity
public class Accounts {
	
	//create instance of compoundkey
	
	 CompoundKey compoundkey;

	private int accountBalance;

	
	@Id
	public CompoundKey getCompoundkey() {
		return compoundkey;
	}

	public void setCompoundkey(CompoundKey compoundkey) {
		this.compoundkey = compoundkey;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	

}
