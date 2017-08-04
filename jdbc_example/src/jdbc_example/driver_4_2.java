package jdbc_example;
import java.sql.*;
public class driver_4_2 
{
	public static void main (String []args) throws Exception
	{
        Class.forName ("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1604:xe","system","0120");
        //1606=port no.
        //jdbc:oracle:thin=type 4 driver
        //system=user name
        //0120=password
        //localhost =running in same system
        //xe=oracle database name
        //url="jdbc:oracle:thin:@localhost:1606:xe","system","0120"
        if(con !=null)
        System.out.println("Connetion with Oracle DB using type4 ..............");
	}
}
