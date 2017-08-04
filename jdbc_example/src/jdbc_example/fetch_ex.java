package jdbc_example;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class fetch_ex 
{
  public static void main(String[] args) throws Exception
  {
	Connection con = provider.getOracleConnection();
	String sql="select multi_file from table_mult where sl_no=?";
	PreparedStatement pst = con.prepareStatement(sql);
	pst.setInt(1,104);
	ResultSet rs=pst.executeQuery();
	if(rs.next())
	{
		FileOutputStream fos= new FileOutputStream("4.jpg");
		InputStream iis = rs.getBinaryStream(1);
		int ch;
		while((ch=iis.read())!=-1)
         {
	        fos.write(ch);
         }
		System.out.println("completed.........");
		fos.close();
		iis.close();
	}
  }
}
