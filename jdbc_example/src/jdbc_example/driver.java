package jdbc_example;
import java.sql.*;
import java.util.*;
public class driver
{
	public static void main(String []args) throws Exception
	{
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	    @SuppressWarnings("rawtypes")
		Enumeration e=DriverManager.getDrivers();
        if(e.hasMoreElements())
        {
           System.out.println(e.nextElement());
        }
	}
} 
