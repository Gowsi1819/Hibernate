package com.hiber.Launch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiber.Entity.Customer;
import com.hiber.Entity.CustomerDetails;
import com.hiber.Entity.Orders;
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

public class Launch {

	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(CustomerDetails.class);
		cfg.addAnnotatedClass(Orders.class);
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction t=session.beginTransaction();
		
		
		
		
		////this code is for saving the data 
//		Orders o1=new Orders(1, "Briyani", 200);
//		Orders o2=new Orders(2, "ChickenFry", 100);
//		
//		Customer c=session.get(Customer.class, 1);
//		o1.setCustomer_id(c);
//		o2.setCustomer_id(c);
//		
//		session.save(o1);
//		session.save(o2);
		
		
		///creating an customer and saving 
		
		Customer c=new Customer(5, "Kavitha");
		CustomerDetails cd=new CustomerDetails(110, "kavitha@gmail.com", 678756, "Bengaluru");
		c.setCustomer_id(cd);
		
		Orders o1=new Orders(4, "Friedrice", 150);
		Orders o2=new Orders(6, "Kebab", 100);
		
		
		o1.setCustomer_id(c);
		o2.setCustomer_id(c);
		
		session.save(o1);
		session.save(o2);
		
		t.commit();
	}
} 
