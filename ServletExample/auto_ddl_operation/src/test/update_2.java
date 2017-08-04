package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import beans.student;
public class update_2
{
public static void main(String[] args) 
{
	SessionFactory sf=new Configuration().configure("resources/mysql.cfg.xml").buildSessionFactory();
	Session s=sf.openSession();
	@SuppressWarnings("unused")
	Transaction t=s.beginTransaction();
	student std=new student();
	std.setId(002);
	std.setName("gud1");
	std.setEmail("gud@gmail.com");
	s.save(std);
	s.merge(std);
	s.update(std);
    t.commit();
    s.close();
	sf.close();
	System.out.println("see the table in the db......");
}
}
