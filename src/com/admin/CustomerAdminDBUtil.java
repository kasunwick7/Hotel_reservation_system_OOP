package com.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerAdminDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null; 
	private static boolean isSuccess;
	
	public static List<Customer> DisplayInAdmin(){
		
		ArrayList<Customer> cus = new ArrayList<>();
		
			try {
					con = DBconnection.getConnection();
					stmt = con.createStatement();
					String sql = "select * from  customer";	    
					rs = stmt.executeQuery(sql);
			    
			    
					while(rs.next()) {
						int id = rs.getInt(1) ;
						String name  = rs.getString(2);
						String email  = rs.getString(3);
						String phone  = rs.getString(4);
						String username  = rs.getString(5);
						String password = rs.getString(6);
				
						Customer c = new Customer(id, name, email, phone, username, password);
						cus.add(c);
					}
				
				}catch (Exception e) {
					e.printStackTrace();
				}
		
			return cus;
	}
			
		public static boolean deleteCustomer(int id) {
			isSuccess = false;
			try {
					con = DBconnection.getConnection();
					stmt = con.createStatement();
					String sql = "DELETE FROM customer WHERE id ='"+id+"'";
					int rst = stmt.executeUpdate(sql);
					
					if(rst > 0) {
						isSuccess=true;
					}
					else {
						isSuccess=false;
					}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return isSuccess;
		}
		
		
	
}
