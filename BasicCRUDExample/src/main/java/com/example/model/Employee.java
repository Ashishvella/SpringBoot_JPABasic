package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table
public class Employee implements Serializable{
	@Id
	@Column
private int empid;
	@Column
private String empname;
	@Column
private String empband;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpband() {
		return empband;
	}
	public void setEmpband(String empband) {
		this.empband = empband;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
