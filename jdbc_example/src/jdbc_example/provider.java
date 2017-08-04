package jdbc_example;
import java.sql.Connection;
import java.sql.DriverManager;
public class provider 
{   
	public static Connection getOracleConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1604:xe","system","0120");
			System.out.println("Connected to ORACLE db....");
			   //1606=port no.
		       //jdbc:oracle:thin=type 4 driver
		       //system=user name
		       //0120=password
		       //localhost =running in same system
		       //xe=oracle database name
		       //url="jdbc:oracle:thin:@localhost:1606:xe","system","0120"
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public static Connection getMysqlConnection()
	{
		Connection con =null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/lit","root","0120");
			System.out.println("Connected  to MYSQL db.....");
			   //3306=default port no.
		       //jdbc:oracle:thin=type 4 driver
		       //system=user name
		       //0120=password
		       //localhost =running in same system
		       //xe=oracle database name
		       //url="jdbc:oracle:thin:@localhost:1606:xe","system","0120"
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return con;

}
}
