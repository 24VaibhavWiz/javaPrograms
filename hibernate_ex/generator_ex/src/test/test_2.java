package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import beans.ticket_ex;
public class test_2 
{
  public static void main(String[] args) 
  {
	SessionFactory sf=new Configuration().configure("resources/mysql.cfg.xml").buildSessionFactory();
	Session s=sf.openSession();
	@SuppressWarnings("unused")
	Transaction t=s.beginTransaction();
	ticket_ex std=new ticket_ex();
	std.setId(1);
	std.setMov_name("11dght09");
	std.setTime(112);
	std.setSeat_no(191);
    //s.save(std);
	//s.persist(std);
	s.update(std);
	t.commit();
	s.close();
	sf.close();
	System.out.println("see the table in the db......");
}
}
