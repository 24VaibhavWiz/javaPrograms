package jdbc_example;
/*
 create or replace procedure proc_insert (roll number,name varchar2,cgpa number)
 is
 begin 
 Insert into student values (roll,name,cgpa);
 end proc_insert;
 /
 */
import java.sql.CallableStatement;
import java.sql.Connection;
public class callable_ex
{
	public static void main(String[] args) throws Exception 
	{
		Connection con=provider.getOracleConnection();
		CallableStatement cst=con.prepareCall("{call proc_insert(?,?,?)}");
		cst.setInt(1, 222);
		cst.setString(2, "bij");
		cst.setDouble(3,9.9);
		cst.execute();
		System.out.println("yes executed succesfully");
	}

}
