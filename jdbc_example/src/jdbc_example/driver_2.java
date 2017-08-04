package jdbc_example;
import java.sql.*;
public class driver_2 
{
	public static void main(String[]args) throws Exception
	{
	   Class.forName("ids.sql.IDSDriver");
	   Connection con= DriverManager.getConnection("jdbc:ids://localhost:12/conn?dsn=DSN_ORACLE","system","0120");
	   if(con!=null)
		  System.out.println("Connected with ORACLE DB.....");
	}
}

