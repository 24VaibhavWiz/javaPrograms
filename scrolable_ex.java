package jdbc_example;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class scrolable_ex 
{	
	public static void main(String[] args) throws Exception 
	{
		Connection con=provider.getOracleConnection();
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=st.executeQuery("select roll,name,cgpa from student");
		System.out.println("traverse in forward");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
			
		}
		System.out.println("traverse in backward");
		while(rs.previous())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
			System.out.println(rs.isFirst());
			System.out.println(rs.isLast());
			System.out.println(rs.isAfterLast());
			System.out.println(rs.isBeforeFirst());
			System.out.println();
			rs.first();
			System.out.println("first record");
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
			rs.last();
			System.out.println("last record");
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
			rs.afterLast();
			rs.beforeFirst();
			rs.absolute(2);
			rs.updateString(2,"k");
			rs.updateRow();
		}
		
		
	}

}
