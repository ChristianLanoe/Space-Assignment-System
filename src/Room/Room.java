package Room;

import java.util.ArrayList;

public class Room {
	private int length;
	private int width;
	private int capacity;
	private int roomNumber;
	private ArrayList<Amenity> amenities;
	
	public Room(int length, int width, int capacity, int roomNumber, ArrayList<Amenity> amenities) {
		this.length = length;
		this.width = width;
		this.capacity = capacity;
		this.roomNumber = roomNumber;
		this.amenities = amenities;
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