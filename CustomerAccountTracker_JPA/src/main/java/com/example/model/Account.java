package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Account implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4891835308102455530L;
	@Id
	@Column
 private Long accountNumber;
	@Column
 private String type;
	@Column
private Double balance;
 
 
public Account() {
	super();
	// TODO Auto-generated constructor stub
}


public Account(Long accountNumber, String type, Double balance) {
	super();
	this.accountNumber = accountNumber;
	this.type = type;
	this.balance = balance;
}


@Override
public String toString() {
	return "Account [accountNumber=" + accountNumber + ", type=" + type + ", balance=" + balance + "]";
}


public Long getAccountNumber() {
	return accountNumber;
}


public void setAccountNumber(Long accountNumber) {
	this.accountNumber = accountNumber;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}


public Double getBalance() {
	return balance;
}


public void setBalance(Double balance) {
	this.balance = balance;
}



}
