package Schedule;

import java.util.ArrayList;

import Request.Request;
import Room.Room;

public class RoomSchedule {
	private Room room;
	private ArrayList<Request> bookings;
	private ArrayList<TimeSpan> bookableTimes;
	
	public RoomSchedule(Room room) {
		this.room = room;
		this.bookableTimes = new ArrayList<TimeSpan>();
		this.bookings = new ArrayList<Request>();
	}
	
	public void addBookableTime(TimeSpan span) {
		bookableTimes.add(span);
	}
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	public void addBookings(Request r) {
		bookings.add(r);
	}
}
