package com.psl.training;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class LearnReasultSetmetadata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Esatblish connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student12","root", "root");
			
			
			//create Statement
			Statement st=con.createStatement();
			
			//Excecute Query
			ResultSet rs=st.executeQuery("Select  * from STUDENT");//we can fetch table information
			
			ResultSetMetaData rm=rs.getMetaData();
			
			System.out.println("First Column Name:"+rm.getColumnName(1));
			
			System.out.println("First column Type:"+rm.getColumnTypeName(1));
			
			System.out.println("Total column:"+rm.getColumnCount());
			
			DatabaseMetaData db=con.getMetaData();
			System.out.println("DatabaseName:"+db.getDatabaseProductName());
			System.out.println("Driver name:"+db.getDriverName());
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
