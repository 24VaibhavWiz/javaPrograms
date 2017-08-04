class Connection_ms_excel
{
	public static void main (String args[])
	{
	   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   Connection con_excel =DriverManager.getConnection("jdbc:odbc:dsn_csv");
	   Connection con_excel =DriverManager.getConnection("jdbc:odbc:dsn_oracle","system","0120");
	   System.out.println(con_data_cv);
	   System.out.println(con_oracle);
	   String sql1="select * from data.csv";
	   String sql2="Insert into student values (?,?,?)";
	   PreparedStatement pst1=con_csv.createStatement(sql1);
	   PreparedStatement pst2=con_oracle.createStatement(sql2);
       ResultSet rs=pst1.executeQuery();
       while(rs.next())
       {
         int roll =rs.getInt(1);
         String name =rs.getString(2);
         double cgpa =rs.getDouble(3);
         System.out.println(roll+"\t"+name+"\t"+cgpa);
         pst2.setInt(1,roll);
         pst2.setString(2,name);
         pst2.ssetDouble(3,cgpa);
         int status =pst2.executeUpdate();
         if(status>0)
         System.out.println("Yes inserted succesfully.........");
       }
	}
}