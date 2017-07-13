package jdbc_example;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class stmt_dml 
{

	public static void main(String[] args)
	{
		Connection con = provider.getOracleConnection();
		int status =0;
		try
		{
			Statement st = con.createStatement();
			String sql = null;
			sql="Insert into menout values (100,raja,'4000')";
			status =st.executeUpdate(sql);
			if(status >0)
			System.out.println("yes inserted");
			sql="Update menout set name='rani',where id=100";
			status =st.executeUpdate(sql);
			if(status>0)
			System.out.println("yes updated");
			sql="delete from menout where eid=100";
			status =st.executeUpdate(sql);
			System.out.println("yes deleted");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

	}

}
