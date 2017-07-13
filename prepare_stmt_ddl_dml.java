package jdbc_example;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class prepare_stmt_ddl_dml 
{
	public static void main(String[] args) 
	{
		Connection con=provider.getMysqlConnection();
		int status =0;
		String sql=null;
		PreparedStatement pst = null;
		sql="create table memot (roll number(4),name varchar2(20),cgpa number(3,1))";
		try
		{
			pst =con.prepareStatement(sql);
			pst.execute();
			System.out.println("yse created");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		try 
		{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			sql="Insert into memot values (?,?,?)";
			pst=con.prepareStatement(sql);
			System.out.println("enter the roll");
			pst.setInt(1, sc.nextInt());
			System.out.println("enter name");
			pst.setString(2, sc.next());
			System.out.println("enter cgpa");
			pst.setDouble(3,sc.nextDouble());
			status = pst.executeUpdate();
			if(status>0)
				System.out.println("inserted");
			else
				System.out.println("not inserted");
			sql="delete from memot where roll =?";
			System.out.println("enter the roll for deletion");
			pst=con.prepareStatement(sql);
			pst.setInt(1, sc.nextInt());
			status=pst.executeUpdate();
			if(status >0)
			
				System.out.println("deleted succesfully");
			else
				System.out.println("error in deletion");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
