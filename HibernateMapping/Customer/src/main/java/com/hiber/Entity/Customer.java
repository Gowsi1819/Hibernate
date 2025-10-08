package com.hiber.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CustomerDetails_id")
	private CustomerDetails customer_id;
	
	public CustomerDetails getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(CustomerDetails customer_id) {
		this.customer_id = customer_id;
	}
	public Customer(){
		
	}
	
	
	@Override
	public String toString() {
		return id+" "+name;
	}
	
	
	
	
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	

}
