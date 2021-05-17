package com.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RoomsAdminDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;  
	private static boolean isSuccess;
	
	
	public static boolean insertRoom(int hotelId, float price, int noOfrooms, int bookedRooms, String hotelName,String type) {
		isSuccess = false;
		String sql = null;
		

	
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
		
			if(type.equals("Luxury Room")) {
				
				sql = "insert into luxaryroom values (0,'"+hotelId+"','"+price+"','"+noOfrooms+"','"+bookedRooms+"','"+hotelName+"','"+type+"')";
			
			}else {
				
				sql = "insert into economyroom values (0,'"+hotelId+"','"+price+"','"+noOfrooms+"','"+bookedRooms+"','"+hotelName+"','"+type+"')";
			
			}
			
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
	public static List<LuxuryRoom> DisplayLuxuryRoomInAdmin(){
		
		ArrayList<LuxuryRoom> lroom = new ArrayList<>();
		
			try {
					con = DBconnection.getConnection();
					stmt = con.createStatement();
					String sql = "select * from  luxaryroom";	    
					rs = stmt.executeQuery(sql);
			    
			    
					while(rs.next()) {
						int luxuryRoomID = rs.getInt(1) ;
						int hotelID  = rs.getInt(2);
						float luxuryRoomPrice  = rs.getFloat(3);
						int noOfLuxRooms  = rs.getInt(4);
						int bookedLRooms  = rs.getInt(5);
						String hotelName  = rs.getString(6);
						String roomType  = rs.getString(7);
					
				
						LuxuryRoom lr = new LuxuryRoom(luxuryRoomID, hotelID, luxuryRoomPrice, noOfLuxRooms, bookedLRooms, hotelName, roomType);
						lroom.add(lr);
					}
				
				}catch (Exception e) {
					e.printStackTrace();
				}
		
			return lroom;
		
		
	}

	public static boolean updateRooms(int rid, int hid, float price, int tno, int bno, String hname, String type) {
		   isSuccess = false;
		   String sql = null; 
		   try {
	    		
	    		con =DBconnection.getConnection();
	    		stmt = con.createStatement();
	    		
	    		if(type.equals("Luxury Room")) {
	    			 sql = "update luxaryroom set LuxaryRoomPrice='"+price+"', noOfLuxaryRooms='"+tno+"', BookedRooms='"+bno+"', hotelName='"+hname+"'"
	    				+ "where idLuxaryRoom='"+rid+"'";
	    		}
	    		else {
	    			 sql = "update economyroom set EconomyRoomPrice='"+price+"',noOfEconomyRooms='"+tno+"',BookedRooms='"+bno+"',hotelName='"+hname+"'"
		    				+ "where idEconomyRoom='"+rid+"'";
		    		
	    		}
	    		
	    		
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


	public static List<EconomyRoom> DisplayEconomyRoomInAdmin(){
	
		ArrayList<EconomyRoom> eroom = new ArrayList<>();
	
		try {
				con = DBconnection.getConnection();
				stmt = con.createStatement();
				String sql = "select * from  economyroom";	    
				rs = stmt.executeQuery(sql);
		    
		    
				while(rs.next()) {
					int economyRoomID = rs.getInt(1) ;
					int hotelID  = rs.getInt(2);
					float economyRoomPrice  = rs.getFloat(3);
					int noOfEcoRooms  = rs.getInt(4);
					int bookedERooms  = rs.getInt(5);
					String hotelName  = rs.getString(6);
					String roomType  = rs.getString(7);
				
			
					EconomyRoom er = new EconomyRoom(economyRoomID, hotelID, economyRoomPrice, noOfEcoRooms, bookedERooms, hotelName, roomType);
					eroom.add(er);
				}
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	
		return eroom;
	
	
	}
	
	public static boolean deleteRooms(int rid,String type) {
		  isSuccess = false;
		  String sql = null; 
		   try {
	    		
	    		con =DBconnection.getConnection();
	    		stmt = con.createStatement();
	    		
	    		if(type.equals("Luxury Room")) {
	    			 sql="DELETE FROM luxaryroom WHERE idLuxaryRoom='"+rid+"'";
	    		}
	    		else {
	    			 sql="DELETE FROM economyroom WHERE idEconomyRoom='"+rid+"'";
	    		}
	    		
	    		
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
}
