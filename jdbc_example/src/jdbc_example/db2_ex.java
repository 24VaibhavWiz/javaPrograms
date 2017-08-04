package jdbc_example;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class db2_ex {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
			Class.forName("com.ibm.db2.jcc.DB2Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:db2://localhost:446/exampledb","dbadmin2","0120");
 
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(conn!=null){
                System.out.println("Connected successfully.");
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
 
    }
 
}

