package test;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class test_select
{
	public static void main(String[] args) 
	{
		SessionFactory sf=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		String hql="select name from student";
		Query q=s.createQuery(hql);
		List<String>list=q.list();
		for(String name:list)
		{
			System.out.println(name);
		}
		s.close();
    	sf.close();			
	}
}
