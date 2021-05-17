package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteRoomsServlet")
public class DeleteRoomsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rid = Integer.parseInt(request.getParameter("rid"));
		String type=request.getParameter("type");
		
		boolean isTrue;
		
		isTrue = RoomsAdminDBUtil.deleteRooms(rid, type);
		
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
