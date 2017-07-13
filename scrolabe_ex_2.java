package jdbc_example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class scrolabe_ex_2
{
	public static void main(String[] args) throws Exception 
	{
		Connection con=provider.getOracleConnection();
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,1008);
		ResultSet rs=st.executeQuery("select roll,name,cgpa from student");
		
			rs.absolute(2);
			rs.updateString(2,"k");
			rs.updateRow();
			System.out.println("row updated");
			rs.absolute(3);
			rs.deleteRow();
			System.out.println("row deleted");
			rs.moveToInsertRow();
			rs.updateInt(1, 200);
			rs.updateString(2, "xyz");
			rs.updateDouble(3, 6.8);
			rs.insertRow();
			System.out.println(rs.getRow());
			rs.afterLast();
			System.out.println(rs.getRow());
			rs.beforeFirst();
			System.out.println(rs.getRow());
			
		}
		
		
	}



