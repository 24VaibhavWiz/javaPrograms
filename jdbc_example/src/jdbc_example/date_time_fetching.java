package jdbc_example;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.sql.Timestamp;
public class date_time_fetching 
{ 
  public static void main(String[] args) throws Exception
  {
	 Connection con= provider.getMysqlConnection();
	 String sql="select td,tt,ts from dts";
	 PreparedStatement pst=con.prepareStatement(sql);
	 ResultSet rs=pst.executeQuery();
	 while(rs.next())
	 {
		 Date d=rs.getDate(1);
		 Time t=rs.getTime(2);
		 Timestamp s=rs.getTimestamp(3);
		 System.out.println(d+"\t"+t+"\t"+s);
	 }
  }
}
