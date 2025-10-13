package com.hiber.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="IdentityCard")
public class IdentityCard{
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String  name;
	
	@Column(name="address")
	private String address;

	public IdentityCard() {
		
	}
	
	
	///Bidirectional code
	@ManyToOne()
	@JoinColumn(name="Person_id")
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public IdentityCard(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Passport [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}