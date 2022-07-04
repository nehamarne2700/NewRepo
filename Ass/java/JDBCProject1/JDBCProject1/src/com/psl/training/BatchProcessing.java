package com.psl.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Esatblish connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student12","root", "root");
			
			//create statment
		     Statement st=con.createStatement();
		    
		    //add query in batch
		    
		     st.addBatch("insert into student values(5,'A')");
		     st.addBatch("update student set stud_name='B' where rollno=4");
		     
		    
		    //5.execute query
		    
		    st.executeBatch();
		    
		    System.out.println("Batch processing is done");
			
		    con.close();
		}
		catch(Exception e)
		{
		  System.out.println(e);	
		}
		
	}

}
