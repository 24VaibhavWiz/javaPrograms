/*
 Mysql databases
 show databases 
 use lit
 craete table DTS (TD date,TT time ,TS timestamp)
 */
package jdbc_example;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Time;
import java.sql.Timestamp;
public class Date__time_store_ex 
{
    public static void main(String[] args) throws Exception
    {
		Connection con = provider.getMysqlConnection();
		String d="2017-07-13";
		String t="04:15:30";
		String s="2017-07-13 04:15:30";
		Date dt=Date.valueOf(d);
		Time ts=Time.valueOf(t);
		Timestamp ss =Timestamp.valueOf(s);
		String sql="Insert into DTS values (?,?,?)";
	    PreparedStatement pst=con.prepareStatement(sql);
	    pst.setDate(1,dt);
	    pst.setTime(2,ts);
	    pst.setTimestamp(3,ss);
	    int status =pst.executeUpdate();
	    if(status>0)
	    	System.out.println("Date,Time and Timestamp inserted succesfully........");
	    else
	    	System.out.println("not inserted ERROR....!!!!");
	}
}
