package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Producer;

public class HQL_2COLUMN_Client {
public static void main(String[] args) 
{
	Configuration cfg = new Configuration();
	cfg.configure("resources/Hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
		Session s =	sf.openSession();

		String hql = "select itemName,id from Producer ";
		
		Query q =s.createQuery(hql);
		List<Object> list = q.list();
		
		for (Object o : list) {
				Object arr[] = (Object[])o;
				System.out.println(arr[0]);
				System.out.println(arr[1]);
				
		
		}
		
		s.close();
		sf.close();
}
}
