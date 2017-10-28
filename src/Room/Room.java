package Room;

import java.sql.Time;
import java.util.ArrayList;

public class Room {
	private int length;
	private int width;
	private int capacity;
	private int roomNumber;
	private Time openTime;
	private Time closedTime;
	private ArrayList<Amenity> amenities;
	
	public Room(int length, int width, int capacity, int roomNumber,Time openTime, Time closedTime, ArrayList<Amenity> amenities) {
		this.length = length;
		this.width = width;
		this.capacity = capacity;
		this.roomNumber = roomNumber;
		this.openTime = openTime;
		this.closedTime =	closedTime;
		this.amenities = amenities;
	}


	public Time getOpenTime() {
		return openTime;
	}


	public void setOpenTime(Time openTime) {
		this.openTime = openTime;
	}


	public Time getClosedTime() {
		return closedTime;
	}


	public void setClosedTime(Time closedTime) {
		this.closedTime = closedTime;
	}


	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public ArrayList<Amenity> getAmenities() {
		return amenities;
	}

	public void setAmenities(ArrayList<Amenity> amenities) {
		this.amenities = amenities;
	}
	
	public void addAmenity(Amenity a) {
		this.amenities.add(a);
	}
}