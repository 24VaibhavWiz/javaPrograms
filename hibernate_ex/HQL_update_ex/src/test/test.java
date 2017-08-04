package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import beans.student;
public class test 
{
	public static void main(String[] args) 
	{
		SessionFactory sf=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();		
		Transaction t=s.beginTransaction();
		student std1=new student(101,"gud","1@gmail.com",90);
		student std2=new student(102,"sud","2@gmail.com",92);
		student std3=new student(103,"rud","3@gmail.com",99);
		student std4=new student(104,"hud","4@gmail.com",89);
		student std5=new student(105,"vud","5@gmail.com",88);
		student std6=new student(106,"dud","6@gmail.com",97);
		s.save(std1);
		s.save(std2);
		s.save(std3);
		s.save(std4);
		s.save(std5);
		s.save(std6);
		t.commit();
		s.close();
		sf.close();
		System.out.println("see the table in the database....");
	}
}


