package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateHotelServlet")
public class UpdateHotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   	 int hotelID = Integer.parseInt(request.getParameter("id"));
    	 String hotelName =  request.getParameter("name");
    	 String email =  request.getParameter("email");
    	 String contactNo =  request.getParameter("phone");
    	 int noOfLuxaryRooms =  Integer.parseInt(request.getParameter("lrooms"));
    	 int noOfEconomyRooms =  Integer.parseInt(request.getParameter("erooms"));
    	 String location =  request.getParameter("location");
    	 String IMG =  request.getParameter("img");
    	 
    	boolean isTrue;
 		
 		isTrue = HotelAdminDBUtil.updateHotel(hotelID, hotelName, email, contactNo, noOfLuxaryRooms, noOfEconomyRooms, location, IMG);
 		
 		String username =AdminLoginServlet.username;
		String password =AdminLoginServlet.password;
			
 		if(isTrue == true) {
 		
 			List<Admin> adminDetails = AdminDBUtil.validate(username, password);
  	  		request.setAttribute("adminDetails", adminDetails);
  	  		
 			List<Hotel> hotelTable = HotelAdminDBUtil.DisplayInAdmin();
  	  		request.setAttribute("hotelDetails", hotelTable);
  	  		
  	  		List<LuxuryRoom>LuxuryRoomTable = RoomsAdminDBUtil.DisplayLuxuryRoomInAdmin();
  	  		request.setAttribute("LuxuryRoomDetails", LuxuryRoomTable);
  		
  	  		List<EconomyRoom>EconomyRoomTable = RoomsAdminDBUtil.DisplayEconomyRoomInAdmin();
  	  		request.setAttribute("EconomyRoomDetails", EconomyRoomTable);
  	  		
	  		List<Customer> CustomerDetails =CustomerAdminDBUtil.DisplayInAdmin();
	  		request.setAttribute("customerDetails", CustomerDetails);
  	  		
 			RequestDispatcher dis = request.getRequestDispatcher("AdminAccount.jsp");
 			dis.forward(request, response);
 		}
 		else {
 			List<Admin> adminDetails = AdminDBUtil.validate(username, password);
  	  		request.setAttribute("adminDetails", adminDetails);
  	  		
 			List<Hotel> hotelTable = HotelAdminDBUtil.DisplayInAdmin();
  	  		request.setAttribute("hotelDetails", hotelTable); 
  	  		
  	  		List<LuxuryRoom>LuxuryRoomTable = RoomsAdminDBUtil.DisplayLuxuryRoomInAdmin();
  	  		request.setAttribute("LuxuryRoomDetails", LuxuryRoomTable);
  	  		
  	  		List<EconomyRoom>EconomyRoomTable = RoomsAdminDBUtil.DisplayEconomyRoomInAdmin();
  	  		request.setAttribute("EconomyRoomDetails", EconomyRoomTable);
  	  			
	  		List<Customer> CustomerDetails =CustomerAdminDBUtil.DisplayInAdmin();
	  		request.setAttribute("customerDetails", CustomerDetails);
  	  		
 			RequestDispatcher dis = request.getRequestDispatcher("AdminAccount.jsp");
 			dis.forward(request, response);
 		}
    	 
	}

}
