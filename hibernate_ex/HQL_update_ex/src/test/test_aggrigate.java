package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class test_aggrigate
{
	public static void main(String[] args) 
	{
		SessionFactory sf=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		String hql="select avg(marks) from student";
		Query q=s.createQuery(hql);
		double avg=(double) q.uniqueResult();
		System.out.println("avg.of marks="+avg);
		s.close();
		sf.close();
	}
}
