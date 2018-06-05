package com.shivam.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class question5 {

	public static void main(String args[]) {

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			Statement st = conn.createStatement();
			
			String query = "Delete from employee WHERE salary<20000";
			
			st.executeUpdate(query);
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
