package jdbc_example;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
public class database_meta_data 
{
   public static void main(String[] args) throws Exception 
   {
	   Connection con=provider.getMysqlConnection();
	   DatabaseMetaData dbmd=con.getMetaData();
	   System.out.println(dbmd.getDatabaseProductName());
	   System.out.println(dbmd.getDatabaseMajorVersion());
	   System.out.println(dbmd.getDatabaseMinorVersion());
	   System.out.println(dbmd.getDatabaseProductVersion());
	   System.out.println("-----------------------------------");
	   System.out.println(dbmd.getDriverName());
	   System.out.println(dbmd.getDriverMajorVersion());
	   System.out.println(dbmd.getDriverMinorVersion());
	   System.out.println(dbmd.getDriverVersion());
	   System.out.println("-----------------------------------");
	   System.out.println(dbmd.getMaxColumnNameLength());
	   System.out.println(dbmd.getMaxColumnsInGroupBy());
	   System.out.println(dbmd.getMaxColumnsInOrderBy());
	   System.out.println(dbmd.getMaxColumnsInSelect());
	   System.out.println(dbmd.getMaxColumnsInTable());
	   System.out.println("-----------------------------------");
   }
}
