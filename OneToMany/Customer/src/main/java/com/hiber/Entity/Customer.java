package com.hiber.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "customer_id",cascade = CascadeType.ALL)
	private List<Orders> orders;
	
	
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
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
