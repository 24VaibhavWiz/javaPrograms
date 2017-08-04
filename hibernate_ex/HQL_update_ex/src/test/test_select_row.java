package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import beans.student;
public class test_select_row
{
	public static void main(String[] args) 
	{
		SessionFactory sf=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();	
		String hql="from student where roll=101";
		Query q=s.createQuery(hql);
		student std=(student) q.uniqueResult();
		System.out.println(std.getRoll());
		System.out.println(std.getName());
		System.out.println(std.getEmail());
		System.out.println(std.getMarks());
		s.close();
		sf.close();			
	}
}
