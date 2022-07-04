package com.psl.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Learndelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Esatblish connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student12","root", "root");
			
			//create Statement
			PreparedStatement p=con.prepareStatement("delete from student where rollno=3");
			
			//excecute statement
			p.execute();
			
			System.out.println("data deleted successfully.....");
			
			//close the connection
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    
	}

}
