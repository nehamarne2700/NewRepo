package com.psl.training.oracle;
import java.sql.*;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
            Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","system");
			
			PreparedStatement p=c.prepareStatement("insert into emp values(?,?,?)");
			
			Scanner s=new Scanner(System.in);
			do
			{
			
			System.out.println("enter empid");
			int i=s.nextInt();
			
			System.out.println("enter empname");
			String s1=s.next();
			
			System.out.println("enter Address");
			String s2=s.next();
			
			
			p.setInt(1, i);
			p.setString(3, s2);
			p.setString(2, s1);
			
			p.executeUpdate();
			
			System.out.println("record inserted....");
			
			System.out.println("do you want to add more records(press y/n)");
			String result=s.next();
			
			if(result.equals("n"))
				break;
			
			}while(true);
		c.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
