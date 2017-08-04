/*
 create table table_mult(sl_no number(4), multi_file BLOB);
 */
package jdbc_example;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class multimedia_ex 
{
   public static void main(String[] args) throws Exception 
   {
	  Connection con =provider.getOracleConnection();
	  String sql ="Insert into table_mult values (?,?)";
	  PreparedStatement pst =con.prepareStatement(sql);
	  FileInputStream fis= new FileInputStream("4.jpg");
	  pst.setInt(1,104);
	  pst.setBinaryStream(2,fis,fis.available());
	  int status =pst.executeUpdate();
	  if(status>0)
		  System.out.println("multimedia stored.........");
	  else
		  System.out.println("error occured..........");
	  fis.close();
	  con.close();
   }
}
