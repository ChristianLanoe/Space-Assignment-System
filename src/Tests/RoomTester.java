package Tests;

import java.util.ArrayList;

import Room.Amenity;
import Room.Room;
import Room.RoomType;

public class RoomTester {
	public static void main(String[] args) {
		ArrayList<Amenity> a = new ArrayList<>();
		a.add(Amenity.Chalkboard);
		a.add(Amenity.DocumentCamera);
		a.add(Amenity.TV);
		
		int CAPACITY = 50;
		int ROOM_NUMBER = 3001;
		RoomType ROOM_TYPE = RoomType.Classroom;
		int LENGTH = 50;
		int WIDTH = 50;
		
		Room room = new Room(ROOM_NUMBER,ROOM_TYPE,CAPACITY,a,LENGTH,WIDTH);
		System.out.println(room.toString());
		
		room.addAmenity(Amenity.OverheadProjector);
		System.out.println("\nAdding an overhead projector");
		System.out.println(room.toString());
		
		System.out.println(room.getAmenities().toString());

	}
}
