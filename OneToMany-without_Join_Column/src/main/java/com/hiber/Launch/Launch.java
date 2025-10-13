package com.hiber.Launch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiber.Entity.IdentityCard;
import com.hiber.Entity.Person;

import java.util.ArrayList;
import java.util.List;

public class Launch {
	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Person.class);
	    cfg.addAnnotatedClass(IdentityCard.class);
	    
	    
	    SessionFactory sessionfactory = cfg.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction t = session.beginTransaction();
		
		
//		Person p=new Person(2, "onion");
//		
//		
//		List<IdentityCard> cards = new ArrayList<>();
//		
//		IdentityCard id1=new IdentityCard(1,"passport","Bengaluru");
//		
//		IdentityCard id2=new IdentityCard(2,"adhaar","Bengaluru");
//		
//		
//	    cards.add(id1);
//	    cards.add(id2);
//		
//		p.setIdentityCard(cards);
//	    
//		session.save(p);
		
		
		Person p=session.get(Person.class, 2);
		
		List<IdentityCard> id=p.getIdentityCard();
		
		System.out.println(p);
		
		System.out.println(id);
		
		t.commit();
	    
	}
	
}
