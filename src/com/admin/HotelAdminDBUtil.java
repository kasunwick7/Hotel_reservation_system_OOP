package com.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HotelAdminDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;  
	private static boolean isSuccess;
	
	public static boolean inserthotel(String name, String email, String phone,int noLroom,int noEroom, String location, String img) {
    	
	 isSuccess = false;
    	
    	try {
    		con = DBconnection.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into hotel values (0,'"+name+"','"+email+"','"+phone+"','"+noLroom+"','"+noEroom+"','"+location+"','"+img+"')";
    		int rst = stmt.executeUpdate(sql);
    		
    		if(rst > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }
	



	
	public static List<Hotel> DisplayInAdmin(){
		
		ArrayList<Hotel> hotel = new ArrayList<>();
		
			try {
					con = DBconnection.getConnection();
					stmt = con.createStatement();
					String sql = "select * from  hotel";	    
					rs = stmt.executeQuery(sql);
			    
			    
					while(rs.next()) {
						int hotelID = rs.getInt(1) ;
						String hotelName  = rs.getString(2);
						String email  = rs.getString(3);
						String contactNo  = rs.getString(4);
						int noOfLuxaryRooms  = rs.getInt(5);
						int noOfEconomyRooms  = rs.getInt(6);
						String location  = rs.getString(7);
						String IMG = rs.getString(8);
				
						Hotel ht = new Hotel(hotelID, hotelName, email, contactNo, noOfLuxaryRooms, noOfEconomyRooms, location, IMG);
						hotel.add(ht);
					}
				
				}catch (Exception e) {
					e.printStackTrace();
				}
		
			return hotel;
		
		
	}
	
	   public static boolean updateHotel(int id, String name, String email, String phone, int lno, int eno, String location, String img) {
		   isSuccess = false;
		   try {
	    		
	    		con =DBconnection.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "update hotel set hotelName='"+name+"',email='"+email+"',contactNo='"+phone+"',noOfLuxaryRooms='"+lno+"',noOfeconomyRooms='"+eno+"',location='"+location+"',hotelIMG='"+img+"'"
	    				+ "where hotelID='"+id+"'";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
		   
		   
		   return isSuccess;   
	   }
	
	public static boolean deleteHotel(int id) {
		try {
			con =DBconnection.getConnection();
    		stmt = con.createStatement();
    		String sql1 ="DELETE FROM hotel WHERE hotelID='"+id+"'";
    		String sql2 ="DELETE FROM economyroom WHERE hotelID='"+id+"'";
    		String sql3 ="DELETE FROM luxaryroom WHERE hotelID='"+id+"'";
    		
    		int r1 = stmt.executeUpdate(sql1);
    		int r2 = stmt.executeUpdate(sql2);
    		int r3 = stmt.executeUpdate(sql3);
    		
    		int rs=r1+r2+r3;
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
}
