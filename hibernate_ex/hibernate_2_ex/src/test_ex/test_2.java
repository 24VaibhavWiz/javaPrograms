package test_ex;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import beans.student;
public class test_2
{
  public static void main(String[] args)
  {
	SessionFactory sf=new Configuration().configure("resources_2/hibernate.cfg.xml").buildSessionFactory();
	Session ss=sf.openSession();
	student st=new student();
	st.setId(001);
	st.setName("gud");
	st.setEmail("gud@gmail.com");
	ss.saveOrUpdate(st);
	ss.close();
	sf.close();
	System.out.println("see the table db.....");
  }
}
