package jdbc_example;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class resultset_metaData 
{
  public static void main(String[] args) throws Exception 
  {
	 Connection con=provider.getOracleConnection();
	 Statement st=con.createStatement();
	 String sql="select * from student";
	 ResultSet rs=st.executeQuery(sql);
	 ResultSetMetaData rsmd =rs.getMetaData();
	 System.out.println(rsmd.getColumnCount());
	 for (int i = 1; i < rsmd.getColumnCount(); i++) 
	 {
		System.out.println(rsmd.getColumnLabel(i)+"\t"+rsmd.getColumnName(i)+"\t"+rsmd.getColumnTypeName(i)+"\t"+rsmd.getColumnName(i)); 
	 }
  }
}
