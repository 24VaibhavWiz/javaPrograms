package test;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import beans.student;
public class test_select_all
{
	public static void main(String[] args) 
	{
		SessionFactory sf=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();	
		String hql="select from student";
		Query q=s.createQuery(hql);
		List<String>list=q.list();
		student std=(student) q.uniqueResult();
		for(String name:list) 
		 {
		   System.out.println(std.getRoll());
		   System.out.println(std.getName());
		   System.out.println(std.getEmail());
		   System.out.println(std.getMarks());
		 }
		s.close();
		sf.close();	
   }
}