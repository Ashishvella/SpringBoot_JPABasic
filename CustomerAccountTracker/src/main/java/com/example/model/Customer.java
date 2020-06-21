package com.example.model;

public class Customer {
 public String custName;
 public String custID;
 public Account account;
 
 
public Customer(String custName, String custID, Account account) {
	super();
	this.custName = custName;
	this.custID = custID;
	this.account = account;
}
@Override
public String toString() {
	return "Customer [custName=" + custName + ", custID=" + custID + ", account=" + account + "]";
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getCustID() {
	return custID;
}
public void setCustID(String custID) {
	this.custID = custID;
}
public Account getAccount() {
	return account;
}
public void setAccount(Account account) {
	this.account = account;
}
 
}
