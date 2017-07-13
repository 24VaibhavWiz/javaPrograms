package jdbc_example;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class stmt_1
{
	public static void main(String[] args)
	{
		Connection con=provider.getOracleConnection();
		try 
		{
			Statement st=con.createStatement();
			boolean result=false;
			String sql=null;
			sql="create table member (Eid number(4) , Ename varchar2(20) , salary number(7,2))";
			System.out.println("Table created");
			result=st.execute(sql);
			sql="Alter table member add(Email_ID varchar2(30))";
			st.execute(sql);
			System.out.println(result);
			sql ="Truncate table Employee";
			result= st.execute(sql);
			System.out.println(result);
			sql="rename member to mem";
			result= st.execute(sql);
			System.out.println(result);
			sql="drop table mem";
			result= st.execute(sql);
			System.out.println(result);
		} 
		catch (SQLException e) 
		{	
			e.printStackTrace();
		}
	}

}
