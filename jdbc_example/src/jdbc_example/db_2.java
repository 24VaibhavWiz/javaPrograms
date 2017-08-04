package jdbc_example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class db_2 
{
   public static void main (String []args) throws SQLException, ClassNotFoundException
   {
	   Class.forName("com.ibm.db2.jcc.DB2Driver");
	   Connection conn=DriverManager.getConnection("jdbc:db2://localhost:1606:DB2COPY1","db2admin","0120");
	   if(conn!=null)
		   System.out.println("succesfully connected to DB2 db..........");
   }
}
