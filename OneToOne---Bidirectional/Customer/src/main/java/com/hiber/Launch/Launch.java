package com.hiber.Launch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiber.Entity.Customer;
import com.hiber.Entity.CustomerDetails;
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

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
		
		/// Bidirectional code
	    CustomerDetails cd=session.get(CustomerDetails.class, 101);
	    Customer c=cd.getCustomer();
	    System.out.println(c);
	    System.out.println(cd);
		
		
		
		
		t.commit();
	}
} 
