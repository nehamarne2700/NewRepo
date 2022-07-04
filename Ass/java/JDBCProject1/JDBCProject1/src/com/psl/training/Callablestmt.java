package com.psl.training;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Callablestmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Esatblish connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student12","root", "root");
			
			//create statement
			CallableStatement c=con.prepareCall("{call result(?,?)}");
			c.setInt(1, 6);
			c.setString(2, "W");
			
			//excute query
			c.execute();
			
			System.out.println("Procedure called...");
			
			//close
			
			con.close();
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
	}

}
