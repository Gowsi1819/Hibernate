package com.hiber.Entity;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="person")
public class Person{
   
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	////Below lines is for unidirectional for bidirectional we need to mention name for mapping bidirectional
	
	//@OneToMany(cascade = CascadeType.ALL)
	//without joincolumn it will create one seperate table
	
	
	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
	private List<IdentityCard> identityCard;
	

	

	public List<IdentityCard> getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(List<IdentityCard> identityCard) {
		this.identityCard = identityCard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public Person() {
		
	}
	
}
