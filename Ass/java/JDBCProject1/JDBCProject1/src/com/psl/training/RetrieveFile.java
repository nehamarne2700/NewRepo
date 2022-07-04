package com.psl.training;

import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Retrieve file from table of DB using Java Program
public class RetrieveFile {

	public static void main(String[] args) {  
		try{  
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish a connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student12", "root","root");
			
			//create statement
		PreparedStatement ps=con.prepareStatement("select * from data");  
		ResultSet rs=ps.executeQuery();  
		rs.next();//now on 1st row  
		              
		Clob c=rs.getClob(2);  
		Reader r=c.getCharacterStream();              
		              
		FileWriter fw=new FileWriter("C:\\Users\\bhagyashri_vikhe\\Desktop\\PPT\\fileinfo.txt");  
		              
		int i;  
		while((i=r.read())!=-1)  
		fw.write((char)i);  
		              
		fw.close();  
		con.close();  
		              
		System.out.println("Data Successfullty written into the file");  
		}catch (Exception e) {e.printStackTrace();  }  
		}  
		}  
