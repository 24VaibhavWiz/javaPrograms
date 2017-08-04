package jdbc_example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Connection_ms_excel 
{
		public static void main (String args[]) throws Exception
		{
		   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		   Connection con_excel =DriverManager.getConnection("jdbc:odbc:dsn_excel");
		   Connection con_oracle =DriverManager.getConnection("jdbc:odbc:dsn_oracle","system","0120");
		   System.out.println(con_excel);
		   System.out.println(con_oracle);
		   String sql1="select * from [sheet1$]";
		   String sql2="Insert into student values (?,?,?)";
		   PreparedStatement pst1=con_excel.prepareStatement(sql1);
		   PreparedStatement pst2=con_excel.prepareStatement(sql2);
	       ResultSet rs=pst1.executeQuery();
	       while(rs.next())
	       {
	         int roll =rs.getInt(1);
	         String name =rs.getString(2);
	         double cgpa =rs.getDouble(3);
	         pst2.setInt(1,roll);
	         pst2.setString(2,name);
	         pst2.setDouble(3,cgpa);
	         int status =pst2.executeUpdate();
	         if(status>0)
	         System.out.println("Yes inserted succesfully.........");
	       }
		}
	}

