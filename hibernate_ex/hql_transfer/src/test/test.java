package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import beans.student_old;
public class test{
public static void main(String[] args) 
{
	SessionFactory sf=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
	Session s=sf.openSession();
	@SuppressWarnings("unused")
	Transaction t=s.beginTransaction();
	student_old std1=new student_old(1,"gud","gud@gmail.com");
	student_old std2=new student_old(2,"gud1","gud@gmail1.com");
	student_old std3=new student_old(3,"gud2","gud@gmail2.com");
	student_old std4=new student_old(4,"gud3","gud@gmail3.com");
	student_old std5=new student_old(5,"gud4","gud@gmail4.com");
	student_old std6=new student_old(6,"gud5","gud@gmail5.com");
    /*std.setId(001);
	std.setName("gud1");
	std.setEmail("gud@gmail.com");*/
	s.save(std1);
	s.save(std2);
	s.save(std3);
	s.save(std4);
	s.save(std5);
	s.save(std6);
	//s.persist(std);
    t.commit();
    s.close();
	sf.close();
	System.out.println("see the table in the db......");
}
}

