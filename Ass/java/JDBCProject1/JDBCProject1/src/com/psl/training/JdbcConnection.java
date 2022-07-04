package com.psl.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



//To perform select command
public class JdbcConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
		//load the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//establish a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student12", "root","root");
		
		//create statement
		
		Statement st=con.createStatement();
		
		//Excecute stament
		ResultSet r=st.executeQuery("select * from student");
		while(r.next())
		{
		   System.out.println(r.getInt(1)+" "+r.getString(2));	
		}
		
		//close connection
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
