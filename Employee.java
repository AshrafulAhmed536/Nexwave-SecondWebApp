package com.del.second.entity;

import java.sql.Date;
public class Employee {
	
	int empid;
	String name;
	double salary;
	Date obj;
	
	public Employee() {
		super();
	}

	public Employee(int empid, String name, double salary, Date obj) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.obj = obj;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getObj() {
		return obj;
	}

	public void setObj(Date obj) {
		this.obj = obj;
	}
	
	
	

}

