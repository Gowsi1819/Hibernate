package com.hiber.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="empId")
	private int empId;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="Design")
	private String empDesgn;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="empPlace")
	private String place;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	public Employee() {
    }

	public Employee(int empId, String empName, String empDesgn, int salary, String place, String email,
			String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesgn = empDesgn;
		this.salary = salary;
		this.place = place;
		this.email = email;
		this.password = password;
	}


	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesgn=" + empDesgn + ", Salary=" + salary
				+ ", place=" + place + ", email=" + email + ", password=" + password + "]";
	}

	
	
	
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
	public String getEmpDesgn() {
		return empDesgn;
	}
	public void setEmpDesgn(String empDesgn) {
		this.empDesgn = empDesgn;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}

	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}
