package com.psl.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//update query
public class Learnupdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Esatblish connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student12","root", "root");
			
			//create statemnt
			PreparedStatement ps=con.prepareStatement("update student set rollno=4 where stud_name='PQR'");
		
			
			//Excecute query
			
			ps.execute();
			
			System.out.println("Data updated successfully....");
			
			//close the connection
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
