package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Producer;

public class HQL_1COLUMN_Client {
public static void main(String[] args) 
{
	Configuration cfg = new Configuration();
	cfg.configure("resources/Hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
		Session s =	sf.openSession();
		Transaction t =s.beginTransaction();		

		String hql = "from Producer  where id = 111";
		
		Query q =s.createQuery(hql);
		Producer p = (Producer)q.uniqueResult();//exactly one user data we r calling

		System.out.println(p.getId());
		System.out.println(p.getItemName());	
		System.out.println(p.getReleaseDate());
		
		t.commit();
		s.close();
		sf.close();
}
}
