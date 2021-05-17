package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

	//create database connection
	
		private static String url="jdbc:mysql://localhost:3306/hotel_reservation_system";
		private static String userName="root";
		private static String passwordDb="1234";
		private static Connection con;
			
		public static Connection getConnection() {
			
			try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, passwordDb);
			}catch (Exception e) {
				System.out.println("Database connection error..");
			}
			
			return con;
		}
			
}
