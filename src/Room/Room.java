package Room;

/*
 * Class that describes a room and its properties
*/
public class Room {
	private int roomNumber;
	private RoomType roomType;
	private int capacity;
	private int length;
	private int width;
	
	public Room(int roomNumber, RoomType roomType, int capacity, int length, int width) {
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.capacity = capacity;
		this.length = length;
		this.width = width;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
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
		sb.append("Room Type: " + roomType.toString());
		sb.append("\n");
		sb.append("Capacity: " + capacity);
		sb.append("\n");
		sb.append("Length: " + length);
		sb.append(" Width: " + width);
		
		return sb.toString();
	}
}