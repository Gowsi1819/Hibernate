package com.hiber.Launch;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiber.Entity.Customer;
import com.hiber.Entity.CustomerDetails;
import com.hiber.Entity.Orders;
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

public class Launch {

	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(CustomerDetails.class);
		cfg.addAnnotatedClass(Orders.class);
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction t = session.beginTransaction();

		
		
		///Getting the data using customer /////////
//		Customer c = session.get(Customer.class, 5);
//
//		System.out.println(c);
//
//		List<Orders> li = c.getOrders();
//
//		for (Object o : li) {
//			System.out.println(o);
//		}

	  ///Deleting one order a customer is deleted to avoid this change in cascade
	 
		Orders o=session.get(Orders.class, 8);
		session.delete(o);
	  
		
		
		t.commit();
	}
}
