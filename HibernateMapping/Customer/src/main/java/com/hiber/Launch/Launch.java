package com.hiber.Launch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiber.Entity.Customer;
import com.hiber.Entity.CustomerDetails;

public class Launch {

	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(CustomerDetails.class);
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction t=session.beginTransaction();
		
		
		///saving the data
//		Customer c=new Customer(4, "Jyothi");
//		CustomerDetails cd=new CustomerDetails(104, "Jyothi@gmail.com", 76564534, "Bengalurur");
//		c.setCustomer_id(cd);
//		
//		session.save(c);
		
		
		///Getting the data 
//		Customer c =session.get(Customer.class, 2);
//		CustomerDetails cd=c.getCustomer_id();
//		System.out.println(c);
//		System.out.println(cd);
		
		
		///Updating the data
//		Customer c =session.get(Customer.class, 4);
//		CustomerDetails cd=c.getCustomer_id();
//		
//		c.setName("Kothi");
//		cd.setEmail("kothi@gmail.com");
		
		
		///Deleting a row
		Customer c =session.get(Customer.class, 2);
		session.delete(c);
		
		
		
		
		t.commit();
	}
} 
