package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Producer;

public class HQL_AggregateFuction {
public static void main(String[] args) 
{
	Configuration cfg = new Configuration();
	cfg.configure("resources/Hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
		Session s =	sf.openSession();

		String hql = "select max(id) from Producer ";
		//list of producer it will return
		
		
		Query q =s.createQuery(hql);
		 int id =(int) q.uniqueResult();
		System.out.println("maximum id is :"+id);
		
		s.close();
		sf.close();
}
}
