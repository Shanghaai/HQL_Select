package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Producer;

public class SELECT_1ROW_Client {
public static void main(String[] args) 
{
	Configuration cfg = new Configuration();
	cfg.configure("resources/Hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
		Session s =	sf.openSession();

		String hql = "from Producer ";
		//list of producer it will return
		
		
		Query q =s.createQuery(hql);
		List<Producer> list = q.list();
		
		for (Producer p : list) {
			
			System.out.println("=================================================");
			System.out.println("ID  :"+p.getId());
			System.out.println("Release Date :"+p.getReleaseDate());
			System.out.println("ITEM NAME :"+p.getItemName());
			
		}
		
		s.close();
		sf.close();
}
}
