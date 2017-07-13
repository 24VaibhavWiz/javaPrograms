package jdbc_example;
import java.sql.Connection;
import java.sql.Savepoint;
import java.sql.Statement;
public class transaction_ex 
{
   public static void main(String[] args) throws Exception 
   {
	   Connection con = provider.getOracleConnection();
       String sql1="Insert into student values (111,'q',9.0)";
	   String sql2="Insert into student values (112,'w',9.4)";
	   String sql3="Insert into student values (113,'e',9.5)";
	   String sql4="Insert into student values (114,'t',9.5)";
	   String sql5="Insert into student values (115,'y',9.5)";
	   String sql6="Insert into student values (116,'r',9.5)";
	   Statement st= con.createStatement();
	   con.setAutoCommit(false);
	   int status=st.executeUpdate(sql1);
	   if(status >0)
		   System.out.println("inserted");
	   else
		   System.out.println("not inserted");
	   con.commit();
	   System.out.println("transaction completed");
	   status=st.executeUpdate(sql2);
	   if(status >0)
		   System.out.println("inserted");
	   else
		   System.out.println("not inserted");
	   con.rollback();
	   System.out.println("rollbacked");
	   con.commit(); 
	   System.out.println("transaction completed");
	   System.out.println("------------------------------------");
	   status=st.executeUpdate(sql2);
	   if(status >0)
		   System.out.println("inserted");
	   else
		   System.out.println("not inserted");
	   con.rollback();
	   System.out.println("rollbacked");
	   con.commit(); 
	   System.out.println("transaction completed");
	   System.out.println("------------------------------------");
	   status=st.executeUpdate(sql3);
	   if(status >0)
		   System.out.println("inserted");
	   else
		   System.out.println("not inserted");
	   con.rollback();
	   System.out.println("rollbacked");
	   con.commit(); 
	   System.out.println("transaction completed");
	   System.out.println("------------------------------------");
	   status=st.executeUpdate(sql4);
	   if(status >0)
		   System.out.println("inserted");
	   else
		   System.out.println("not inserted");
	   con.rollback();
	   System.out.println("rollbacked");
	   con.commit(); 
	   System.out.println("transaction completed");
	   System.out.println("------------------------------------");
	   status=st.executeUpdate(sql5);
	   if(status >0)
		   System.out.println("inserted");
	   else
		   System.out.println("not inserted");
	   con.rollback();
	   System.out.println("rollbacked");
	   con.commit(); 
	   System.out.println("transaction completed");
	   System.out.println("------------------------------------");
	   status=st.executeUpdate(sql6);
	   if(status >0)
		   System.out.println("inserted");
	   else
		   System.out.println("not inserted");
	   con.rollback();
	   System.out.println("rollbacked");
	   con.commit(); 
	   System.out.println("transaction completed");
	   System.out.println("------------------------------------");
	   Savepoint sp2=con.setSavepoint();
	   System.out.println("created");
	   System.out.println(status);
	   status =st.executeUpdate(sql6);
	   con.rollback(sp2);
	   System.out.println("rollbaked");
	   con.commit();
	   System.out.println("committed");
	   
   }
}
