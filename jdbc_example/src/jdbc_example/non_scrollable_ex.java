package jdbc_example;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class non_scrollable_ex 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection con=provider.getMysqlConnection();
		Statement st = con.createStatement();
		String sql="select roll,name,cgpa from cse";
		ResultSet rs= st.executeQuery(sql);
		System.out.println("student details");
		int count_record=0;
		while(rs.next())
		{
			int roll=rs.getInt(1);
			String name =rs.getString("name");
			double cgpa =rs.getDouble(3);
			System.out.println(roll+"\t"+name+"\t"+cgpa);
			count_record++;
		}
		System.out.println("no. of records : "+count_record);
	}

}
