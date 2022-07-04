package com.psl.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Learninsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		    //Esatblish connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student12","root", "root");
			
			//create statemnt
			PreparedStatement st=con.prepareStatement("insert into student values(?,?)");
			st.setString(2, "PQR");
			st.setInt(1, 3);
			
			//exceute query
			
			st.execute();
			
			System.out.println("data inserted successfully into table of db");
			
			//close the connection
			con.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
