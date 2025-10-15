package com.hiber.Entity;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
   
	@Id
	@Column(name="id")
	private int id;
	@Column(name="employee_name")
	private String employee_name;
	
	
	
	@ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable(name="Emp_Pro", 
	      joinColumns = @JoinColumn(name="Employee_id"),
	      inverseJoinColumns = @JoinColumn(name="Project_id"))
	private List<Project> projects;
	
	
	public Employee() {
		
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employee_name=" + employee_name + "]";
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public Employee(int id, String employee_name) {
		super();
		this.id = id;
		this.employee_name = employee_name;
	}
	
	
	
}
