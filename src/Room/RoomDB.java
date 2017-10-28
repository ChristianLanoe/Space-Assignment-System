package Room;

import java.util.ArrayList;
import java.util.Iterator;

import Room.Room;

public class RoomDB {
	private ArrayList<Room> Rooms;  // All rooms in building
	
	public RoomDB() {
		this.Rooms = new ArrayList<Room>();
	}
	
	/*
		Returns the room object from room number
	
		@param	roomNumber	the number of the room being searched for
		@return				the room being searched for. If no room with that number exists, returns null
	*/
	public Room getRoom(int roomNumber) {
		for (Iterator<Room> i = Rooms.iterator(); i.hasNext();) {
			Room room = i.next();
			if(room.getRoomNumber() == roomNumber)
				System.out.println(room);
				return room;
		}
		
		return null;
	}
}
