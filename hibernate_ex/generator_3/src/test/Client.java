package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.BookTicket;

public class Client
{
	public static void main(String[] args) {
		Configuration cfg =new Configuration();		
		cfg.configure("resources/oracle.cfg.xml");		
		SessionFactory sf=cfg.buildSessionFactory();	
		Session session =sf.openSession();				
		Transaction t=session.beginTransaction();	
			
		//create BookMovie object					
		BookTicket bm=new BookTicket ();				
		//bm.setId(111); 						
		bm.setMovie("abc");					
		bm.setSeatno(23); 					
		bm.setShowtime("20am");				
		int  pk=(Integer)session.save(bm);
		
		t.commit();							
		session.close(); 						
		sf.close();								
		System.out.println("update  success"+pk);
		}
	

}
