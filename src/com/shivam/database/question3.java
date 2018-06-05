package com.shivam.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class question3 {
	
	public static void main(String args[]) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			Statement st = conn.createStatement();
		
			String query = "select * from employee e,department d where e.dep_no=d.dep_no AND d.dep_name='Human_Resource'";
			
			ResultSet rs = st.executeQuery(query);
			String email="",query2="";
			Scanner s = new  Scanner(System.in);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+" "+rs.getString(6)+" "+" "+rs.getString(7)+" "+" "+rs.getString(8)+" "+rs.getString(11));			
				System.out.println("Enter email: ");
			email= s.nextLine();
			query2="update employee SET emp_mail='"+email+"' where emp_id = '"+rs.getInt(1)+"'";
			
			Statement st1 = conn.createStatement();
			st1.executeUpdate(query2);
			conn.close();
			}
		}
		
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
}

}
