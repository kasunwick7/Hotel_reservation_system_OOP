package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static String username;
	public static String password;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 username = request.getParameter("uid");
		 password = request.getParameter("password");
		
		try {
			
			List<Admin> adminDetails = AdminDBUtil.validate(username, password);
  	  		request.setAttribute("adminDetails", adminDetails);
  	  		
  	  		List<Hotel> hotelTable = HotelAdminDBUtil.DisplayInAdmin();
  	  		request.setAttribute("hotelDetails", hotelTable);
  	  		
  	  		List<LuxuryRoom> LuxuryRoomTable = RoomsAdminDBUtil.DisplayLuxuryRoomInAdmin();
	  		request.setAttribute("LuxuryRoomDetails", LuxuryRoomTable);
	  		
	  		List<EconomyRoom> EconomyRoomTable = RoomsAdminDBUtil.DisplayEconomyRoomInAdmin();
	  		request.setAttribute("EconomyRoomDetails", EconomyRoomTable);
	  		
	  		List<Customer> CustomerDetails =CustomerAdminDBUtil.DisplayInAdmin();
	  		request.setAttribute("customerDetails", CustomerDetails);
	  		
	  		
  	  		
		}catch (Exception e) {
			System.out.println("aaaaaaaa1");
		}
  	  	RequestDispatcher dis = request.getRequestDispatcher("AdminAccount.jsp");
  	  	dis.forward(request, response); 
	  
  	  	
		 
		
	}

}
