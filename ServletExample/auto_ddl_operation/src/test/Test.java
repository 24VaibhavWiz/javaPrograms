package test;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Test
{
 public static void main(String[] args)
 {
	SessionFactory sf=new Configuration().configure("resources/mysql.cfg.xml").buildSessionFactory();
	sf.close();
	System.out.println("tables created.......");
 }
}
