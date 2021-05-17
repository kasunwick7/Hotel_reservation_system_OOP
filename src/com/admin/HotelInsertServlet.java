package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HotelInsertServlet")
public class HotelInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		int noLroom = Integer.parseInt(request.getParameter("lrooms"));
		int noEroom= Integer.parseInt(request.getParameter("erooms"));
		String location = request.getParameter("location");
		String img = request.getParameter("img");
		
		boolean isTrue = HotelAdminDBUtil.inserthotel(name, email, phone, noLroom, noEroom,location,img);
		
		String username =AdminLoginServlet.username;
		String password =AdminLoginServlet.password;
		if(isTrue == true) {
			
			RequestDispatcher dis1 = request.getRequestDispatcher("RoomsForm.jsp");
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

			RequestDispatcher dis2 = request.getRequestDispatcher("Unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
