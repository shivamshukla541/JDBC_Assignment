package com.shivam.database;

import java.sql.*;

public class question2 {
	
	public static void main(String args[]) {
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		Statement st = conn.createStatement();
		
		
		String query = "select * from employee emp,department dept where salary = (select salary from employee order by salary desc limit 2,1) and emp.dep_no=dept.dep_no order by salary desc";
		
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(6)+" "+rs.getString(7));
		}
		conn.close();
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
	
	}

}
