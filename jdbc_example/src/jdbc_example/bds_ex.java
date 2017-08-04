package jdbc_example;
import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp.BasicDataSource;
public class bds_ex
{

	public static void main(String[] args) throws SQLException
	{
        BasicDataSource bds=new BasicDataSource ();
        bds.setDriverClassName("oracle.jdbc.OracleDriver");
        bds.setUrl("jdbc:oracle:thin:@localhost:1606:xe");
        bds.setUsername("system");
        bds.setPassword("0120");
        //1606=port no.
        //jdbc:oracle:thin=type 4 driver
        //system=user name
        //0120=password
        //localhost =running in same system
        //xe=oracle database name
        //url="jdbc:oracle:thin:@localhost:1606:xe","system","0120"
        Connection con =bds.getConnection();
        System.out.println(con);
        if(con!=null)
        	System.out.println("Connected with ORACLE using BDS.......");
	}

}
