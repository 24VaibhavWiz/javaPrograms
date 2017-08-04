package jdbc_example;
import java.sql.Connection;
public class multi_conn_ex 
{
    public static void main(String[]args)
    {
    	Connection con_ora =provider.getOracleConnection();
    	Connection con_mysql =provider.getMysqlConnection();
    	System.out.println(con_ora);
    	System.out.println(con_mysql);
    }
}
