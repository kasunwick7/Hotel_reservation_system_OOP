package com.admin;

public class Hotel {
	private int hotelID;
	private String hotelName;
	private String email;
	private String contactNo;
	private int noOfLuxaryRooms;
	private int noOfEconomyRooms;
	private String location;
	private String IMG;
	
	public Hotel(int hotelID, String hotelName, String email, String contactNo, int noOfLuxaryRooms,
			int noOfEconomyRooms, String location, String IMG) {
		super();
		this.hotelID = hotelID;
		this.hotelName = hotelName;
		this.email = email;
		this.contactNo = contactNo;
		this.noOfLuxaryRooms = noOfLuxaryRooms;
		this.noOfEconomyRooms = noOfEconomyRooms;
		this.location = location;
		this.IMG = IMG;
	}

	public int getHotelID() {
		return hotelID;
	}

	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public int getNoOfLuxaryRooms() {
		return noOfLuxaryRooms;
	}

	public void setNoOfLuxaryRooms(int noOfLuxaryRooms) {
		this.noOfLuxaryRooms = noOfLuxaryRooms;
	}

	public int getNoOfEconomyRooms() {
		return noOfEconomyRooms;
	}

	public void setNoOfEconomyRooms(int noOfEconomyRooms) {
		this.noOfEconomyRooms = noOfEconomyRooms;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIMG() {
		return IMG;
	}

	public void setIMG(String iMG) {
		IMG = iMG;
	}
	
	
}
