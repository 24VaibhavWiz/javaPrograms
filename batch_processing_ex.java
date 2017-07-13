package jdbc_example;
import java.sql.Connection;
import java.sql.Statement;
public class batch_processing_ex
{
   public static void main(String[] args) throws Exception
   {
	  Connection con=provider.getOracleConnection();
	  String sql1="Insert into student values (111,'q',9.0)";
	  String sql2="Insert into student values (112,'w',9.4)";
	  String sql3="Insert into student values (113,'e',9.5)";
	  String sql4="update student set name='c' where roll=119";
	  String sql5="Delete from student where cgpa=9.0";
	  Statement st= con.createStatement();
	  st.addBatch(sql1);
	  st.addBatch(sql2);
	  st.addBatch(sql3);
	  st.addBatch(sql4);
	  st.addBatch(sql5);
	  int status[]=st.executeBatch();
	  for (int i = 0; i < status.length; i++)
	  {
		System.out.println(status[i]);
	  }
   }
}
