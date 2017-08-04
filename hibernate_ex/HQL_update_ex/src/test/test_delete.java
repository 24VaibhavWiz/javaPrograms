package test;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class test_delete
{
	public static void main(String[] args) 
	{
		SessionFactory sf=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();	
		Transaction t=s.beginTransaction();
		String hql="delete student where roll=106";
		Query q=s.createQuery(hql);
		int i=q.executeUpdate();
		//s.save(hql);
		t.commit();
		System.out.println("no of rows delete="+i);
		s.close();
		sf.close();
	}
}
