package com.hiber.config;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hiber.entity.Employee;



public class MainClass {

	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		
		//SAVING THE OBJECT IN THE DATABASE,EACH ROW IS CONSIDERED AS ONE OBJECT
//		Employee e=new Employee(3, "Mona", "Hr", 30_000, "Bengaluru", "mona@gmail.com", "mona@123");
//		session.save(e);
		
		//for getting a data
//		Employee e=session.get(Employee.class, 123);
//		System.out.println(e);
		
		//for updating a single data
//		Employee e=session.get(Employee.class, 123);
//		e.setSalary(12_000);
//		session.update(e);
		
		//Deleting an data
//		Employee e=session.get(Employee.class, 123);
//		session.delete(e);
		
		//Getting all the data from database
//		Query<Employee> query=session.createQuery("from Employee e");
//		List list=query.getResultList();
//		for(Object i:list)
//		{
//			System.out.println(i);
//		}
		
		Transaction t=session.beginTransaction();
		//Updating the whole table
//		Query query = session.createQuery("update Employee e set e.salary = 10000 where e.salary = 0");
//		int n=query.executeUpdate();
//		System.out.println(n);
		
		
		//Deleting a table 
		Query query = session.createQuery("delete from Employee e where e.salary = 10000");
		int n=query.executeUpdate();
		System.out.println(n);
		
		
		t.commit();
	}
}
