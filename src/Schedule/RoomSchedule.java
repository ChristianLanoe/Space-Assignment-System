package Schedule;

import java.util.ArrayList;
import java.util.Iterator;

import Request.Request;
import Room.Room;

public class RoomSchedule {
	private Room room;
	private ArrayList<Request> bookings;
	private ArrayList<DayOfWeekTimeSpan> bookableTimes;
	
	public RoomSchedule(Room room) {
		this.room = room;
		this.bookableTimes = new ArrayList<DayOfWeekTimeSpan>();
		this.bookings = new ArrayList<Request>();
	}
	
	public void addBookableTime(DayOfWeekTimeSpan span) {
		bookableTimes.add(span);
	}
	
	public String getBookableTimesMessage() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Room ").append(room.getRoomNumber());
		sb.append(" is bookable from: \n");
		for (Iterator<DayOfWeekTimeSpan> i = bookableTimes.iterator(); i.hasNext();) {
			DayOfWeekTimeSpan timeSpan = i.next();
			sb.append(timeSpan.toString());
			sb.append("\n");
		}
		
		return sb.toString();
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
	
//	@Override 
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		
//		if(!.isEmpty()) {
//			sb.append(room.getRoomNumber());
//			sb.append(" is booked for ");
//			for(Iterator<TimeSpan> i = bookable)
//		}
//		
//		return sb.toString();
//	}
}
