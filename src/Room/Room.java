package Room;

/*
 * Class that describes a room and its properties
*/
public class Room implements Comparable<Room>{
	private int roomNumber;
	private int capacity;
	private int length;
	private int width;
	
	public Room(int roomNumber, int capacity, int length, int width) {
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.length = length;
		this.width = width;
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Room Number: " + roomNumber);
		sb.append("\n");
		sb.append("Capacity: " + capacity);
		sb.append("\n");
		sb.append("Length: " + length);
		sb.append(" Width: " + width);
		
		return sb.toString();
	}

	@Override
	public int compareTo(Room r) {
		return this.getRoomNumber() - r.getRoomNumber();
	}
}