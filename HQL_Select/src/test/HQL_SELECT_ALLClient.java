package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Producer;

public class HQL_SELECT_ALLClient {
public static void main(String[] args) 
{
	Configuration cfg = new Configuration();
	cfg.configure("resources/Hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
		Session s =	sf.openSession();

		String hql = "select itemName from Producer ";
		
		Query q =s.createQuery(hql);
		List<String> list = q.list();
		
		for (String itemName : list) {
			System.out.println(itemName);
		}
		
		s.close();
		sf.close();
}
}
