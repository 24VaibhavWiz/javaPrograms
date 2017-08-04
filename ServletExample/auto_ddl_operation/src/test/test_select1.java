package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import beans.student;
public class test_select1 
{
@SuppressWarnings("unused")
public static void main(String[] args) 
{
	SessionFactory sf=new Configuration().configure("resources/hibernate.cfg.xml").buildSessionFactory();
	Session s=sf.openSession();
	@SuppressWarnings("unused")
	Transaction t=s.beginTransaction();
	Object o=s.get(student.class,002);
	student std=(student)o;
	System.out.println(std.getId());
	System.out.println(std.getName());
	System.out.println(std.getEmail());
    t.commit();
    s.close();
	sf.close();
	System.out.println("see the table in the db......");
}
}

