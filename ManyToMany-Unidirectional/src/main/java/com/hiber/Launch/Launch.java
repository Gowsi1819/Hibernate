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

        
//		Employee ravi=new Employee(5, "Ravi");
//		Employee raghul=new Employee(28, "Raghul");
//		
//		Project CRM=new Project(3,"CRMy");
//		Project DLP=new Project(23,"DLPU");
//		
//		ArrayList<Project> emplist=new ArrayList<Project>();
//		emplist.add(CRM);
//		emplist.add(DLP);
//		
//		ravi.setProjects(emplist);
//		raghul.setProjects(emplist);
//		
//		session.save(ravi);  
//		session.save(raghul);
//		session.save(CRM);
//		session.save(DLP);
		
		
		Employee e=session.get(Employee.class, 28);
		List<Project> p=e.getProjects();
		
		System.out.println(e);
		System.out.println(p);
		
		t.commit();
	}
}
