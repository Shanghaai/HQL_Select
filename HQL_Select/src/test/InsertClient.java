package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Producer;

public class InsertClient {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("resources/Hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
		Session s =	sf.openSession();
		Transaction t =s.beginTransaction();		

		
		Producer p1 = new Producer(111, "powder", "19/08/2014");
		Producer p2 = new Producer(222, "khaccha namak", "21/10/16");
		Producer p3 = new Producer(333, "pakka Namak", "22/10/16");
		
		s.save(p1);
		s.save(p2);
		s.save(p3);
		t.commit();
		s.close();
		sf.close();
		System.out.println("data inserted ");
}
}
