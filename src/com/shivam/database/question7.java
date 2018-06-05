package com.shivam.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class question7 {
	
	public static void main(String args[]) {

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			Statement st = conn.createStatement();
			
			String query = "ALTER TABLE employee DROP CONSTRAINT FK1";
			String query2 = "DROP TABLE department";
			
			st.executeUpdate(query);
			st.executeUpdate(query2);
			
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
