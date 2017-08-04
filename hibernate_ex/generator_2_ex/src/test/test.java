package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import beans.ticket;
public class test {
	public static void main(String[] args) {
			Configuration cfg =new Configuration();		
			cfg.configure("resources/oracle.cfg.xml");		
			SessionFactory sf=cfg.buildSessionFactory();	
			Session session =sf.openSession();
			Transaction t=session.beginTransaction();	
			//create BookTicket object					
			ticket bm=new ticket ();				
			bm.setId(111); 						
			bm.setMovie("pk");					
			bm.setSeatno(21); 					
			bm.setShowtime("10am");				
			@SuppressWarnings("unused")
			int pk=(Integer)session.save(bm);	
			t.commit();							
			session.close(); 						
			sf.close();								
			System.out.println("insert success");
			}
		
	}

