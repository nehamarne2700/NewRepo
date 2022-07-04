package com.psl.training;

//Insert file into table of DB using Java Program
	import java.io.*;  
	import java.sql.*;  
	  
	public class InsertFile {

	public static void main(String[] args) {  
	try{  
		//load the driver
				Class.forName("com.mysql.jdbc.Driver");
				
				//establish a connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student12", "root","root");
				
				//create statement
				
	PreparedStatement ps=con.prepareStatement("insert into data values(?,?)");  
	              
	File f=new File("C:\\Users\\bhagyashri_vikhe\\Desktop\\PPT\\data.txt");  
	FileReader fr=new FileReader(f);  
	              
	ps.setInt(1,101);  
	ps.setCharacterStream(2,fr,(int)f.length());  
	ps.executeUpdate();  
	System.out.println("File inserted successfully....");  
	              
	con.close();  
	              
	}catch (Exception e) {e.printStackTrace();}  
	}  
	}  