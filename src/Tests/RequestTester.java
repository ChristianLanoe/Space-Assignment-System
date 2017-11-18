package Tests;

import java.time.LocalDateTime;
import java.util.ArrayList;

import Request.Request;
import Room.Amenity;
import Room.Room;
import Room.RoomType;

public class RequestTester {
	public static void main(String[] args) {
		int roomNumber = 3001;
		int capacity = 50;
		int length = 45;
		int width = 55;
		RoomType type = RoomType.Classroom;
		ArrayList<Amenity> amenities = new ArrayList<Amenity>();
		amenities.add(Amenity.Chalkboard);
		
		Room room = new Room(roomNumber, type, capacity, amenities, length, width);
		
		LocalDateTime startTime = LocalDateTime.now().withMinute(0).minusHours(1);
		LocalDateTime endTime = startTime.plusHours(4);
		
		String desc = "book this room NOW please :)";
		
		long phoneNumber = 17097463956L;
		
		Request req = new Request("Eric", "Elli",phoneNumber,"eric_elli_91@hotmail.com",room,startTime,endTime,desc);
		System.out.println(req.toString());
	}
}
