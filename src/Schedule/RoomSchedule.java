package Schedule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import Request.Request;
import Room.Room;

//Class that refers to a room and the times it is able to be booked and the times it is booked

public class RoomSchedule implements Comparable<RoomSchedule>{
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
		Collections.sort(bookableTimes);
	}
	
	public void addBooking(Request request) {
		bookings.add(request);
		Collections.sort(bookings);
	}
	
	public ArrayList<DayOfWeekTimeSpan> getBookableTimes() {
		return bookableTimes;
	}
	
	public ArrayList<Request> getBookings() {
		return bookings;
	}
	
	public String getBookableTimesString() {
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

	@Override
	public int compareTo(RoomSchedule rs) {
		int roomNum = rs.getRoom().getRoomNumber();
		return this.room.getRoomNumber() - roomNum;
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
