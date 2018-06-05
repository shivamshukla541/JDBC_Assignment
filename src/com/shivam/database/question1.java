package com.shivam.database;

import java.sql.*;

public class question1 {
	
	public static void main(String args[]) {
		
		String insertion1 = "insert into employee values(1111,'Hardik','Sharma',60000,'2017-09-29','Technical','T1','hardik@mealpha.com')";
//		String insertion2 = "insert into employee values(2222,'Shaan','Bhattacharya',65000,'2017-09-29','Technical','T2','shaan@mealpha.com')";
//		String insertion3 = "insert into employee values(3333,'Sukhdeep','Singh',58000,'2017-05-10','Marketing','M1','sukhdeep@mealpha.com')";
//		String insertion4 = "insert into employee values(4444,'Kaustabh','Raj',68000,'2017-01-05','Operations_Management','OM1','kaustabh@mealpha.com')";
//		String insertion5 = "insert into employee values(5555,'Deepak','Sharma',6000,'2018-05-26','Technical','T1','deepak@mealpha.com')";
//		String insertion6 = "insert into employee values(6666,'Shivam','Shukla',5000,'2018-05-28','Technical','T2','shivam@mealpha.com')";
//		String insertion7 = "insert into employee values(7777,'Vrinda','Vashisht',5000,'2018-06-01','Finance','F2','vrinda@mealpha.com')";
//		String insertion8 = "insert into employee values(8888,'Abhinav','Rastogi',7000,'2018-06-01','Human_Resource','HR1','abhinav@mealpha.com')";
//		String insertion9 = "insert into employee values(9999,'Harvey','Specter',80000,'2016-12-15','Human_Resource','HR2','harvey@mealpha.com')";
//		String insertion10 = "insert into employee values(1010,'Mike','Ross',50000,'2016-12-12','Human_Resource','HR1','mike@mealpha.com')";
//		String in_dep1 = "insert into department values('T1','Technical','Delhi')";
//		String in_dep2 = "insert into department values('T2','Technical','Bangalore')";
//		String in_dep3 = "insert into department values('T3','Technical','Delhi')";
//		String in_dep4 = "insert into department values('T4','Technical','Bangalore')";
//		String in_dep5 = "insert into department values('OM1','Technical','Delhi')";
//		String in_dep6 = "insert into department values('HR2','Human_Resource','Bangalore')";
//		String in_dep7 = "insert into department values('M1','Technical','Delhi')";
//		String in_dep8 = "insert into department values('M2','Technical','Bangalore')";
//		String in_dep9 = "insert into department values('HR1','Human_Resource','Bangalore')";
//		String in_dep10 = "insert into department values('F2','Finance','Delhi')";

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			Statement st = conn.createStatement();
			
			int result1 = st.executeUpdate(insertion1);
			System.out.println(result1);
	
			
			
			ResultSet rs = st.executeQuery("select * from employee;");
			while(rs.next()) {
		
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+" "+rs.getString(6)+" "+" "+rs.getString(7)+" "+" "+rs.getString(8));
			
			}
			conn.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
			
	}
	
}
