package com.example.model;

public class Account {
 public Long accountNumber;
 public String type;
public Double balance;
 
 
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
