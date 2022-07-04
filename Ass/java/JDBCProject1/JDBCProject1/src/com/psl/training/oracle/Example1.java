package com.psl.training.oracle;
import java.sql.*;

//to connect java app with oracle database
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//step1 : load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");//oracle
			
			//step2:create a connection
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			
			
			//step3: create the statement
			Statement st=c.createStatement();
			
			//step 4:execute query
			ResultSet r=st.executeQuery("select * from emp");
			System.out.println("Employee table");
			while(r.next())
			{
				System.out.println(r.getInt(1)+"\t"+r.getString(2)+"\t"+r.getString(3));
			}
			
			
			//step 5:close connection
			c.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
