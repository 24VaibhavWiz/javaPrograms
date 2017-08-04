package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import bean.student;
public class test_1
{
  public static void main(String[] args) 
  {
	SessionFactory sfc=new Configuration().configure("resources/mysql.cfg.xml").buildSessionFactory();
	Session s=sfc.openSession();
	student std=new student();
	std.setId(001);
	std.setName("gud");
	std.setEmail_id("gud@gmail.com");
	s.save(std);
	s.close();
	sfc.close();
	System.out.println("see the table in the db.....");
  }
}
