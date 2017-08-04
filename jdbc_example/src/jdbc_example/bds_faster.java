package jdbc_example;
import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp.BasicDataSource;

public class bds_faster 
{
	public static void main(String[] args) throws SQLException
	{
	      BasicDataSource bds=new BasicDataSource ();
	        bds.setDriverClassName("oracle.jdbc.OracleDriver");
	        bds.setUrl("jdbc:oracle:thin:@localhost:1606:xe");
	        bds.setUsername("system");
	        bds.setPassword("0120");
	        //3306=default port no.
	        //jdbc:oracle:thin=type 4 driver
	        //system=user name
	        //0120=password
	        //localhost =running in same system
	        //xe=oracle database name
	        //url="jdbc:oracle:thin:@localhost:1606:xe","system","0120"
	        long start1=System.currentTimeMillis();
	        for(int i=0;i<=5000;i++)
	        {
	             Connection con =bds.getConnection();
	             System.out.println(con.hashCode());
	             con.close();
	        }
	        long stop1 =System.currentTimeMillis();
	        System.out.println(stop1-start1);
	        System.out.println("-----------------------------------");
	        long start2 = System.currentTimeMillis();
	        for(int j=0;j<=5000;j++)
	        {
	        	Connection con =provider.getOracleConnection();
	            System.out.println(con.hashCode());
	            con.close();
	        }
	        long stop2= System.currentTimeMillis();
	        System.out.println(stop2-start2);
	}
}
