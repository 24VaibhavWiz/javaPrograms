package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class transformation_test
{
	public static void main (String args[])
	{				
		Configuration cfg =new Configuration();			
		cfg.configure("resources/oracle.cfg.xml");				
		SessionFactory sf=cfg.buildSessionFactory();					
		Session session =sf.openSession();						
		Transaction t=session.beginTransaction();
	    String hql="insert into student_new (id,name,email) select s.id, s.name, s.email from student_old s";
        Query q = session.createQuery(hql);							
	    int i = q.executeUpdate();		
	    t.commit();
	    System.out.println("no of rows dump from old to new table "+i);
	    session.close(); 								
	    sf.close();
	}
}

