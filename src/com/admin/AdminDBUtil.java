package com.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class AdminDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;  
	
	public static List<Admin> validate(String id,String password) {
		
		ArrayList<Admin> admin = new ArrayList<>();
		
		try {
				con = DBconnection.getConnection();
				stmt = con.createStatement();
				String sql = "select * from admin where id='"+id+"' and password='"+password+"'";	    
			    rs = stmt.executeQuery(sql);
			    
			    
			    if(rs.next()) {
			    	String Uid = rs.getString(1);
			    	String name = rs.getString(2);
			    	String passwordU = rs.getString(3);
			    	String email = rs.getString(4);
			    
				
			    	Admin ad = new Admin(Uid,name,passwordU,email);
			    	admin.add(ad);
			    }
				
			}catch (Exception e) {
				System.out.println("Erorrr..");
			}
		
		return admin;
	}
	
}
