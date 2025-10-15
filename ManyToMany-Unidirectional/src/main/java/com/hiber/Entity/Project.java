package com.hiber.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name="project")
public class Project {

	@Id
	@Column(name="id")
    private int id;
	
	@Column(name="Project_name")
    private String Project_name;
	
	
//	@ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
//	@JoinTable(name="Emp_Pro", 
//			 inverseJoinColumns  = @JoinColumn(name="Employee_id"),
//	     joinColumns = @JoinColumn(name="Project_id"))
//	private List<Employee> employee;
//	
	
	
	public Project() {
		
	}
	
	@Override
	public String toString() {
		return "Project [id=" + id + ", Project_name=" + Project_name + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProject_name() {
		return Project_name;
	}
	public void setProject_name(String project_name) {
		Project_name = project_name;
	}
	public Project(int id, String project_name) {
		super();
		this.id = id;
		Project_name = project_name;
	}
    
    
}
