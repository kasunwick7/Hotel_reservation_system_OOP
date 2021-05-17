package com.admin;

public class EconomyRoom {
	private int economyRoomID;
	private int hotelID;
	private float economyRoomPrice;
	private int noOfEcoRooms;
	private int bookedERooms;
	private String hotelName;
	private String roomType;
	public EconomyRoom(int economyRoomID, int hotelID, float economyRoomPrice, int noOfEcoRooms, int bookedERooms,
			String hotelName, String roomType) {
		super();
		this.economyRoomID = economyRoomID;
		this.hotelID = hotelID;
		this.economyRoomPrice = economyRoomPrice;
		this.noOfEcoRooms = noOfEcoRooms;
		this.bookedERooms = bookedERooms;
		this.hotelName = hotelName;
		this.roomType = roomType;
	}
	public int getEconomyRoomID() {
		return economyRoomID;
	}
	public void setEconomyRoomID(int economyRoomID) {
		this.economyRoomID = economyRoomID;
	}
	public int getHotelID() {
		return hotelID;
	}
	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}
	public float getEconomyRoomPrice() {
		return economyRoomPrice;
	}
	public void setEconomyRoomPrice(float economyRoomPrice) {
		this.economyRoomPrice = economyRoomPrice;
	}
	public int getNoOfEcoRooms() {
		return noOfEcoRooms;
	}
	public void setNoOfEcoRooms(int noOfEcoRooms) {
		this.noOfEcoRooms = noOfEcoRooms;
	}
	public int getBookedERooms() {
		return bookedERooms;
	}
	public void setBookedERooms(int bookedERooms) {
		this.bookedERooms = bookedERooms;
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
