<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Simple Smart Living</title>
	<link rel="stylesheet" type ="text/css" href="style/kzunCss.css" />
</head>
<body>
	 <hr>

	
		<h1 class = "title1"><center>TravelAnyWhere</center></h1>
		<h3 class = "title2"><center>HOTELS, RESORTS, VILLAS & MORE</center></h3>
		
    <hr>

    <ul class = "mainmenu">
        <li><a href = "#">Home</a></li>
        <li><a href = "#">Hotels</a></li>
		<li><a href = "#">Villas</a></li>
		<li><a href = "#">Resorts</a></li>
		<li><a href = "#">Your Bookings</a></li>
        <li><a href = "#">About Us</a></li>
		<li><a href = "#">Contact Us</a></li>
		<li><a href = "#">Help</a></li>
		
	
	
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li><a href = "#">Login</a></li>
		<li><a href = "#">SignUp</a></li>
    </ul>
	<hr>
	<center>
	<h1 style="font-family:verdana; font-size:50; color:#16a085;"> Administrator Page</h1><br /><br />
	<table id="table">
	<c:forEach var="admin" items="${adminDetails}">
	
	<tr>
		<td>ID</td>
		<td>${admin.id}</td>
	</tr>
	<tr>
		<td>Name</td>
		<td>${admin.name}</td>
	</tr>
	<tr>
		<td>Password</td>
		<td>${admin.password}</td>
	</tr>
	<tr>
		<td>Email</td>
		<td>${admin.email}</td>
	</tr>


	</c:forEach>
	</table>
	</center>
	<br>
	<br>
	<center>
	<button type="button" onclick="javascript:window.location='Forms.jsp'">Insert information</button>
	</center>
	<br>
	<br>
	<table id="table">
		<tr>
    		<th>ID</th>
   			<th>Name</th> 
    		<th>Email</th>
    		<th>Contact No</th>
    		<th>No OfLuxary Rooms</th>
    		<th>No Of Economy Rooms</th> 
    		<th>Location</th>
    		<th>Image</th>
    		<th>Update Hotel Info</th>
    		<th>Delete Hotel Info</th>
  		</tr>
  		
	<c:forEach var="hotel" items="${hotelDetails}">
	
	<c:set var="id" value="${hotel.hotelID}"/>
	<c:set var="name" value="${hotel.hotelName}"/>
	<c:set var="email" value="${hotel.email}"/>
	<c:set var="contact" value="${hotel.contactNo}"/>
	<c:set var="lr" value="${hotel.noOfLuxaryRooms}"/>
	<c:set var="er" value="${hotel.noOfEconomyRooms}"/>
	<c:set var="location" value="${hotel.location}"/>
	<c:set var="img" value="${hotel.IMG}"/>
	
	<c:url value="UpdateHotel.jsp" var="updatehotel">
	
	<c:param name="id" value="${id}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="contact" value="${contact}"/>
	<c:param name="lr" value="${lr}"/>
	<c:param name="er" value="${er}"/>
	<c:param name="location" value="${location}"/>
	<c:param name="img" value="${img}"/>
	</c:url>
  	
  	<c:url value="DeleteHotel.jsp" var="deletehotel">
	
	<c:param name="id" value="${id}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="contact" value="${contact}"/>
	<c:param name="lr" value="${lr}"/>
	<c:param name="er" value="${er}"/>
	<c:param name="location" value="${location}"/>
	<c:param name="img" value="${img}"/>
	</c:url>
  	<tr>
   		<td>${hotel.hotelID}</td>
   		<td>${hotel.hotelName}</td>
   		<td>${hotel.email}</td>
   		<td>${hotel.contactNo}</td>
   		<td>${hotel.noOfLuxaryRooms}</td>
   		<td>${hotel.noOfEconomyRooms}</td>
   		<td>${hotel.location}</td>
   		<td>${hotel.IMG}</td>
   		<td><a href="${updatehotel}"><input type="button" name="update" value="Update"> </a></td>
   		<td><a href="${deletehotel}"><input type="button" name="delete" value="Delete"> </a></td>
   		
  	</tr>
 		
	


	</c:forEach>
	
	</table>
	<br>
	<br>
	<br>
	<br>
	<table id="table">
		<tr>
    		<th>Luxury Room ID</th>
   			<th>Hotel ID</th> 
    		<th>Luxury Room Price</th>
    		<th>No Of Luxury Rooms</th>
    		<th>Booked Rooms</th> 
    		<th>Hotel Name</th>
    		<th>Room type</th>
    		<th>Update Room Info</th>
    		<th>Delete Room Info</th>
    		
  		</tr>
  		
	<c:forEach var="Lrooms" items="${LuxuryRoomDetails}">
	
	<c:set var="rid" value="${Lrooms.luxuryRoomID}"/>
	<c:set var="hid" value="${Lrooms.hotelID}"/>
	<c:set var="price" value="${Lrooms.luxuryRoomPrice}"/>
	<c:set var="tno" value="${Lrooms.noOfLuxRooms}"/>
	<c:set var="bno" value="${Lrooms.bookedLRooms}"/>
	<c:set var="hname" value="${Lrooms.hotelName}"/>
	<c:set var="type" value="${Lrooms.roomType}"/>
	
	
	<c:url value="UpdateRooms.jsp" var="updateLrooms">
	
	<c:param name="rid" value="${rid}"/>
	<c:param name="hid" value="${hid}"/>
	<c:param name="price" value="${price}"/>
	<c:param name="tno" value="${tno}"/>
	<c:param name="bno" value="${bno}"/>
	<c:param name="hname" value="${hname}"/>
	<c:param name="type" value="${type}"/>
	
	</c:url>
	<c:url value="DeleteRooms.jsp" var="deleteLrooms">
	
	<c:param name="rid" value="${rid}"/>
	<c:param name="hid" value="${hid}"/>
	<c:param name="price" value="${price}"/>
	<c:param name="tno" value="${tno}"/>
	<c:param name="bno" value="${bno}"/>
	<c:param name="hname" value="${hname}"/>
	<c:param name="type" value="${type}"/>
	
	</c:url>
  		
  	<tr>
   		<td>${Lrooms.luxuryRoomID}</td>
   		<td>${Lrooms.hotelID}</td>
   		<td>${Lrooms.luxuryRoomPrice}</td>
   		<td>${Lrooms.noOfLuxRooms}</td>
   		<td>${Lrooms.bookedLRooms}</td>
   		<td>${Lrooms.hotelName}</td>
   		<td>${Lrooms.roomType}</td>
   		
   		<td><a href="${updateLrooms}"><input type="button" name="update" value="Update"> </a></td>
   		<td><a href="${deleteLrooms}"><input type="button" name="delete" value="Delete"> </a></td>
   		
  	</tr>
 		
	


	</c:forEach>
	</table>
	<br>
	<br>
	<br>
	<br>
	<table id="table">
		<tr>
    		<th>Economy Room ID</th>
   			<th>Hotel ID</th> 
    		<th>Economy Room Price</th>
    		<th>No Of Economy Rooms</th>
    		<th>Booked Rooms</th> 
    		<th>Hotel Name</th>
    		<th>Room type</th>
    		<th>Update Room Info</th>
    		<th>Delete Room Info</th>
    		
  		</tr>
  		
	<c:forEach var="Erooms" items="${EconomyRoomDetails}">
	
	<c:set var="rid" value="${Erooms.economyRoomID}"/>
	<c:set var="hid" value="${Erooms.hotelID}"/>
	<c:set var="price" value="${Erooms.economyRoomPrice}"/>
	<c:set var="tno" value="${Erooms.noOfEcoRooms}"/>
	<c:set var="bno" value="${Erooms.bookedERooms}"/>
	<c:set var="hname" value="${Erooms.hotelName}"/>
	<c:set var="type" value="${Erooms.roomType}"/>
	
	
	<c:url value="UpdateRooms.jsp" var="updateErooms">
	
	<c:param name="rid" value="${rid}"/>
	<c:param name="hid" value="${hid}"/>
	<c:param name="price" value="${price}"/>
	<c:param name="tno" value="${tno}"/>
	<c:param name="bno" value="${bno}"/>
	<c:param name="hname" value="${hname}"/>
	<c:param name="type" value="${type}"/>
	
	</c:url>
	<c:url value="DeleteRooms.jsp" var="deleteErooms">
	
	<c:param name="rid" value="${rid}"/>
	<c:param name="hid" value="${hid}"/>
	<c:param name="price" value="${price}"/>
	<c:param name="tno" value="${tno}"/>
	<c:param name="bno" value="${bno}"/>
	<c:param name="hname" value="${hname}"/>
	<c:param name="type" value="${type}"/>
	
	</c:url>
  		
  	<tr>
   		<td>${Erooms.economyRoomID}</td>
   		<td>${Erooms.hotelID}</td>
   		<td>${Erooms.economyRoomPrice}</td>
   		<td>${Erooms.noOfEcoRooms}</td>
   		<td>${Erooms.bookedERooms}</td>
   		<td>${Erooms.hotelName}</td>
   		<td>${Erooms.roomType}</td>
   		
   		<td><a href="${updateErooms}"><input type="button" name="update" value="Update"> </a></td>
   		<td><a href="${deleteErooms}"><input type="button" name="delete" value="Delete"> </a></td>
   		
  	</tr>
 		
	


	</c:forEach>
	</table>
	<br>
	<br>
	<br>
	<br>
	<table id="table">
		<tr>
    		<th>Customer ID</th>
   			<th>Name</th> 
    		<th>Email </th>
    		<th>Contact Number  </th>
    		<th>User name</th> 
    		<th>Password</th>
    		<th>Delete Room Info</th>
    		
  		</tr>
  		
	<c:forEach var="cus" items="${customerDetails}">
	
	<c:set var="id" value="${cus.id}"/>
	<c:set var="name" value="${cus.name}"/>
	<c:set var="email" value="${cus.email}"/>
	<c:set var="phone" value="${cus.phone}"/>
	<c:set var="username" value="${cus.username}"/>
	<c:set var="password" value="${cus.password}"/>

	
	
	<c:url value="DeleteCustomerAd.jsp" var="deleteCus">
	
	<c:param name="id" value="${id}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="phone" value="${phone}"/>
	<c:param name="username" value="${username}"/>
	<c:param name="password" value="${password}"/>

	
	</c:url>

  	<tr>
   		<td>${cus.id}</td>
   		<td>${cus.name}</td>
   		<td>${cus.email}</td>
   		<td>${cus.phone}</td>
   		<td>${cus.username}</td>
   		<td>${cus.password}</td>
   		<td><a href="${deleteCus}"><input type="button" name="delete" value="Delete"> </a></td>
   		
  	</tr>
 		
	


	</c:forEach>
	</table>
	<br>
	<br>
	<br>
	<br>
	<div class = "destinations">
        <table background = "images/704513.jpg" alt="destinations" width = "100%" height = "400">
            <tr>
				<center><h3 class = "locations">Most popular destinations</h3></center>
			</tr>
			<tr>
                <td><center><img src = "images/colombo.jpg" width = "150" height = "150" class = "destinations" alt="colombo"/><h3>Colombo</h3></center></td>
                <td><center><img src = "images/Negombo.jpg" width = "150" height = "150" class = "destinations" alt="negombo"/><h3>Negombo</h3></center></td>
                <td><center><img src = "images/Kandy.jpg" width = "150" height = "150" class = "destinations" alt="kandy"/><h3>Kandy</h3></center></td>
                <td><center><img src = "images/Nuwara-Eliya.jpg" width = "150" height = "150" class = "destinations" alt="nuwara eliya"/><h3>Nuwara Eliya</h3></center></td>
				<td><center><img src = "images/Mirissa.jpg" width = "150" height = "150" class = "destinations" alt="mirissa"/><h3>Mirissa</h3></center></td>
				<td><center><img src = "images/Ella.jpg" width = "150" height = "150" class = "destinations" alt="ella"/><h3>Ella</h3></center></td>
				<td><center><img src = "images/Sigiriya.jpg" width = "150" height = "150" class = "destinations" alt="sigiriya"/><h3>Sigirya</h3></center></td>
				<td><center><img src = "images/unawatuna.jpg" width = "150" height = "150" class = "destinations" alt="unawatuna"/><h3>Unawatuna</h3></center></td>
            </tr>
        </table>
    </div>

	
	
	<footer>
	<div class = "bottom">
		<center>
		<table class = "socialmedia" width = "80%">
			<tr>
				<th><img class = "social" src = "images/FacebookLogo.png"><br><a href ="http:\\www.facebook.com"/>Facebook</th>
				<th><img class = "social" src = "images/TwitterLogo.png"><br><a href ="http:\\www.twitter.com"/>Twitter</th>
				<th><img class = "social" src = "images/InstagramLogo.png"><br><a href ="http:\\www.instagram.com"/>Instagram</th>
				<th><img class = "social" src = "images/YouTubeLogo.png"><br><a href ="http:\\www.youtube.com"/>YouTube</th>
				<th><img class = "social" src = "images/GplusLogo.png"><br><a href ="http:\\www.google+.com"/>Google+</th>
				<th><img class = "social" src = "images/LinkedinLogo.png"><br><a href ="http:\\www.Linkedin.com"/>Linkedin</th>
				<th><img class = "social" src = "images/PinterestLogo.png"><br><a href ="http:\\www.Pinterest.com"/>Pinterest</th>
			</tr>
		</table>
		
		<p class = "footerdetails">The most trusted website in online travel and related services.<p> 
		
		<table class = "contactdetails" width = "80%">
			<tr>
				<th><img class ="contacts" src ="images/emailLogo.png"><br>simplesmartliving@gmail.com</th>
				<th><img class ="contacts" src ="images/Tellogo.png"><br>+94115069829</th>
				<th><img class ="contacts" src ="images/addressLogo.png"><br>Sri Lanka Dahanayake Mw,<br>100 Independence Square,<br>Colombo 00700</th>
			</tr>
			
		</table>
		
		<h4 class ="copyright">Copyright @ 2019 Smart Living, All Rights Reserved.</h4>
		</center>
	</div>
	</footer>
	

</body>
</html>