package com.psl.training.oracle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
            Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","system");
			
			
			PreparedStatement p1=c.prepareStatement("delete from emp where empid=?");
			
			p1.setInt(1, 1);
			
			p1.executeUpdate();
			
			System.out.println("Record deleted successfully....");
			
			c.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
