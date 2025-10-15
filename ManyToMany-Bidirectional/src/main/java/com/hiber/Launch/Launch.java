package com.hiber.Launch;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiber.Entity.Employee;
import com.hiber.Entity.Project;


public class Launch {

	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Project.class);
		
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction t = session.beginTransaction();

        
		Project p=session.get(Project.class, 23);
		
		List<Employee> e=p.getEmployee();
		
		System.out.println(e);
		System.out.println(p);
		
		
		t.commit();
	}
}
