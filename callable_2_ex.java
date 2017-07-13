/*
 create or replace Funcation fun_count (c number)
 return number
 is 
 cnt number(4);
 begin
 select * into cnt from student where cgpa>=c;
 return cnt;
 end fun_count;
 /
*/
package jdbc_example;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
public class callable_2_ex 
{
 public static void main(String[] args) throws Exception
 {
	Connection con =provider.getOracleConnection();
	CallableStatement cst=con.prepareCall("{?=Call fun_count(?)}");
	cst.setDouble(2,6.0);
	cst.registerOutParameter(1,Types.INTEGER);
	System.out.println("number of student more than or equal to cgpa 6.0" +cst.getInt(1));
	System.out.println("executed sucessfully");
 }
}
