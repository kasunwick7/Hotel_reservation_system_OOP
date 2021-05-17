<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<h1 style="font-family:verdana; font-size:50; color:#16a085;"> Insert New Room Information</h1><br /><br />

<form action ="rInsert" method="post">
	
		<h3 style="font-family:verdana; color:#2ecc71; " >Hotel ID  </h3><input type="text" name="hid"><br>
		<h3 style="font-family:verdana; color:#2ecc71; " > Room Price </h3> <input type="text" name="price"><br>
		<h3 style="font-family:verdana; color:#2ecc71; " >Number of Rooms</h3> <input type="text" name="rooms"><br>
	 	<h3 style="font-family:verdana; color:#2ecc71; " >Booked Rooms </h3> <input type="text" name="bkrooms"><br>
		<h3 style="font-family:verdana; color:#2ecc71; " >Hotel Name</h3> <input type="text" name="hname"><br>
		<h3 style="font-family:verdana; color:#2ecc71; " >Select Room Type  </h3> <select name="type">
							<option value="Luxury Room">Luxury Room</option>
  							<option value="Economy Room">Economy Room</option>
  						</select><br><br>
		
		
		<input type="submit" name="submit" value="Add Rooms for hotels ">
	</form>
</center>
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
				<th><img class ="contacts" src ="images/TelLogo.png"><br>+94115069829</th>
				<th><img class ="contacts" src ="images/addressLogo.png"><br>Sri Lanka Dahanayake Mw,<br>100 Independence Square,<br>Colombo 00700</th>
			</tr>
			
		</table>
		
		<h4 class ="copyright">Copyright @ 2019 Smart Living, All Rights Reserved.</h4>
		</center>
	</div>
	</footer>
</body>
</html>