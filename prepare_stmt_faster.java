package jdbc_example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
public class prepare_stmt_faster
{
	public static void main(String[] args)throws Exception
	{
		Connection con=provider.getOracleConnection();
		String sql1="Insert into mem values (100,'raja',7.7)";
		String sql2="Insert into mem values (?,?,?)";
		Statement st=con.createStatement();
		PreparedStatement pst=con.prepareStatement(sql2);
		pst.setInt(1, 200);
		pst.setString(2, "rani");
		pst.setDouble(3, 6.9);
		System.out.println("for prepared statement");
		long start1 =System.currentTimeMillis();
		System.out.println(start1);
		for(int i=0;i<200000;i++)
		{
			pst.executeUpdate();
		}
		long stop1 = System.currentTimeMillis();
		System.out.println(stop1-start1);
		System.out.println("for statement interface");
		long start2=System.currentTimeMillis();
		System.out.println(start2);
		for(int i=0;i<200000;i++)
		{
			st.executeUpdate(sql1);
		}
		long stop2 =System.currentTimeMillis();
		System.out.println(stop2-start2);
	}

}
