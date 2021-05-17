package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RoomInsertServlet")
public class RoomInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int hotelId = Integer.parseInt(request.getParameter("hid"));
		float price = Float.parseFloat(request.getParameter("price"));
		int noOfrooms= Integer.parseInt(request.getParameter("rooms"));
		int bookedRooms= Integer.parseInt(request.getParameter("bkrooms"));
		String hotelName = request.getParameter("hname");
		String type = request.getParameter("type");
		
		boolean isTrue = RoomsAdminDBUtil.insertRoom(hotelId, price, noOfrooms, bookedRooms, hotelName,type);
		
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
  	  		
			RequestDispatcher dis1 = request.getRequestDispatcher("AdminAccount.jsp");
			dis1.forward(request, response);
			
				
		} else {
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
  	  		
			RequestDispatcher dis2 = request.getRequestDispatcher("AdminAccount.jsp");
			dis2.forward(request, response);
		}
	}

}
