import java.sql.*;
import java.util.ResourceBundle;
import java.lang.*;
import java.io.*;
public class DBConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {        
        ResourceBundle rb = ResourceBundle.getBundle("oracle");
        String url = rb.getString("db.url");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");
        Connection con=null;
        try
         {
         //load the driver
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         //establish a connection
         con=DriverManager.getConnection(url, username,password);
         return con;
         }
         catch(Exception e)
         {
            System.out.println("DOcon"+e);
         }
         return con;
    }
}