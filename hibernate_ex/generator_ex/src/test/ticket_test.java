package test;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class ticket_test
{	
  public static void main(String[] args)
  {
	 Configuration cfg=new Configuration();
	 cfg.configure("resources/mysql.cfg.xml");
	 SessionFactory sf=cfg.buildSessionFactory();
	 sf.close();
	 System.out.println("table created.......");
   }
}
