package test;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class test_update
{
	public static void main(String[] args) 
	{
		SessionFactory sf=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		String hql="update student set name='mud', email='3@gmail.com' where roll=103";
		Query q=s.createQuery(hql);
		int i=q.executeUpdate();
		//s.save(hql);
		t.commit();
		System.out.println("no of rows updated="+i);
		s.close();
		sf.close();
	}
}
