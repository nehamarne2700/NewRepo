package com.psl.training.oracle;
import java.sql.*;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
            Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//step2:create a connection
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","system");
			
			//step3: create the statement
			Statement st=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			//step 4:execute query
			ResultSet r=st.executeQuery("select * from emp");
			System.out.println("Employee table");
			r.absolute(2);
			
			System.out.println(r.getInt(1)+"\t"+r.getString(2)+"\t"+r.getString(3));
			
			
			
			//step 5:close connection
			c.close();
			
			
		}
		catch(Exception e)
		{
			
		}
	}

}
