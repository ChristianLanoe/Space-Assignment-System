package Schedule;

import java.util.ArrayList;
import java.util.Iterator;

import Room.Room;

//Class for Handling all the room schedules
public class Calendar {
	private ArrayList<RoomSchedule> calendar;
	
	public Calendar() {
		calendar = new ArrayList<RoomSchedule>();
	}
	
	public void addRoomSchedule(RoomSchedule rs) {
		calendar.add(rs);
	}
	
	public void removeRoomSchedule(RoomSchedule rs) {
		calendar.remove(rs);
	}
	
	public RoomSchedule getRoomSchedule(Room room) {
		for(Iterator<RoomSchedule> i = calendar.iterator(); i.hasNext();) {
			RoomSchedule rs = i.next();
			if (rs.getRoom() == room) {
				return rs;
			}
		}
		return null;
	}
}
