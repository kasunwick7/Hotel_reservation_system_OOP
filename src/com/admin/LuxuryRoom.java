package com.admin;

public class LuxuryRoom {
	private int luxuryRoomID;
	private int hotelID;
	private float luxuryRoomPrice;
	private int noOfLuxRooms;
	private int bookedLRooms;
	private String hotelName;
	private String roomType;
	
	public LuxuryRoom(int luxuryRoomID, int hotelID, float luxuryRoomPrice, int noOfLuxRooms, int bookedLRooms,
			String hotelName, String roomType) {
		super();
		this.luxuryRoomID = luxuryRoomID;
		this.hotelID = hotelID;
		this.luxuryRoomPrice = luxuryRoomPrice;
		this.noOfLuxRooms = noOfLuxRooms;
		this.bookedLRooms = bookedLRooms;
		this.hotelName = hotelName;
		this.roomType = roomType;
	}

	public int getLuxuryRoomID() {
		return luxuryRoomID;
	}

	public void setLuxuryRoomID(int luxuryRoomID) {
		this.luxuryRoomID = luxuryRoomID;
	}

	public int getHotelID() {
		return hotelID;
	}

	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}

	public float getLuxuryRoomPrice() {
		return luxuryRoomPrice;
	}

	public void setLuxuryRoomPrice(float luxuryRoomPrice) {
		this.luxuryRoomPrice = luxuryRoomPrice;
	}

	public int getNoOfLuxRooms() {
		return noOfLuxRooms;
	}

	public void setNoOfLuxRooms(int noOfLuxRooms) {
		this.noOfLuxRooms = noOfLuxRooms;
	}

	public int getBookedLRooms() {
		return bookedLRooms;
	}

	public void setBookedLRooms(int bookedLRooms) {
		this.bookedLRooms = bookedLRooms;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	
}
