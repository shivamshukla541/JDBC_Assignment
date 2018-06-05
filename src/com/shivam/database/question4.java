package com.shivam.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class question4 {
	
	public static void main(String args[]) {

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			Statement st = conn.createStatement();
			
			
		
			String insertion1 = "insert into employee values(1212,'Yash','Chaudhary',6500,'2018-04-03','Technical','T1','yash@mealpha.com')";
	//		String insertion2 = "insert into employee values(1313,'John','Cena',70000,'2017-11-16','Human_Resource','HR2','john@mealpha.com')";
	//		String insertion3 = "insert into employee values(1414,'Rachel','Zane',65000,'2018-10-25','Marketing','M2','rachel@mealpha.com')";

			st.executeUpdate(insertion1);
			conn.close();
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
			
		}

}
