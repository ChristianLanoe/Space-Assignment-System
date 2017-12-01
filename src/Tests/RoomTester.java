package Tests;

import Room.Room;

public class RoomTester {
	public static void main(String[] args) {
		int CAPACITY = 50;
		String ROOM_NAME = "Gym";
		int ROOM_NUMBER = 3001;
		int LENGTH = 50;
		int WIDTH = 50;
		
		Room room = new Room(ROOM_NUMBER,ROOM_NAME,CAPACITY,LENGTH,WIDTH);
		System.out.println(room.toString());
	}
}
