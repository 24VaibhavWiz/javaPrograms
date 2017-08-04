package jdbc_example;
import java.sql.*;
public class driver_4
{
	public static void main(String []args) throws Exception
	{
	   Class.forName("oracle.jdbc.OracleDriver");
	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lit","root","0120");
	   //3306=default port no.
       //jdbc:oracle:thin=type 4 driver
       //system=user name
       //0120=password
       //localhost =running in same system
       //xe=oracle database name
       //url="jdbc:oracle:thin:@localhost:1606:xe","system","0120"
	   if(con != null)
	   System.out.println("Connected with mysql DB using type4....");
	}
}
 
