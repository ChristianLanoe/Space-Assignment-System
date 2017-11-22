package Schedule;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import Request.Request;
import Room.Room;

//Class that refers to a room and the times it is able to be booked and the times it is booked

public class RoomSchedule implements Comparable<RoomSchedule> {
	private Room room;
	private ArrayList<Request> bookings;		//ArrayList of approved requests
	private ArrayList<DayOfWeekTimeSpan> bookableTimes;	//ArrayList of the availability times of the room 
	private boolean[] available;		//Boolean array for each hour block in a day

	public RoomSchedule(Room room) {
		this.room = room;
		this.bookableTimes = new ArrayList<DayOfWeekTimeSpan>();
		this.bookings = new ArrayList<Request>();
	}

	public void populateAvailable(ArrayList<DayOfWeekTimeSpan> bookableTimes, ArrayList<Request> bookings) {
		available = new boolean[24];
		for (DayOfWeekTimeSpan dow_ts : bookableTimes) {
			int start = dow_ts.getTimeSpan().getStartTime().getHour();
			int end = dow_ts.getTimeSpan().getEndTime().getHour();
			for (int i = start; i < end; i++) {
				available[i] = true;
			}
		}

		for (Request request : bookings) {
			int start = request.getStartTime().getHour();
			int end = request.getEndTime().getHour();
			for (int i = start; i < end; i++) {
				available[i] = false;
			}
		}
	}
	
	public void addBookableTime(DayOfWeekTimeSpan span) {
		bookableTimes.add(span);
		Collections.sort(bookableTimes);
	}

	public void addBooking(Request request) {
		bookings.add(request);
		Collections.sort(bookings);
	}

	public void addAvailable(boolean[] available) {
		this.available = available;
	}

	public boolean[] getAvailable() {
		populateAvailable(bookableTimes, bookings);
		return available;
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

	// Returns a RoomSchedule for a specific date
	public RoomSchedule forDate(LocalDate date) {
		RoomSchedule daySchedule = new RoomSchedule(this.room);
		// Iterate through each element in bookableTimes
		for (Iterator<DayOfWeekTimeSpan> i = bookableTimes.iterator(); i.hasNext();) {
			DayOfWeekTimeSpan dow_ts = i.next();
			// Only add DayOfWeekTimeSpans that have the same day of week as the date
			if (dow_ts.getDayOfWeek() == date.getDayOfWeek()) {
				daySchedule.addBookableTime(dow_ts);
			}
			// Since all DayOfWeekTimeSpans are sorted, once you find a DayOfWeek that is
			// greater than the date, you can stop iterating
			if (dow_ts.getDayOfWeek().getValue() > date.getDayOfWeek().getValue()) {
				break;
			}
		}
		for (Iterator<Request> i = bookings.iterator(); i.hasNext();) {
			Request request = i.next();
			// Only add Requests that start on the same date as the date
			// StartTime uses LocalDateTime, so we convert it to a LocalDate
			if (request.getStartTime().toLocalDate().compareTo(date) == 0) {
				daySchedule.addBooking(request);
			}
			// Requests are sorted by StartTime, same logic as above for DayOfWeekTimeSpans
			if (request.getStartTime().toLocalDate().isAfter(date)) {
				break;
			}
		}
		daySchedule.getAvailable();
		return daySchedule;
	}

	@Override
	public int compareTo(RoomSchedule rs) {
		int roomNum = rs.getRoom().getRoomNumber();
		return this.room.getRoomNumber() - roomNum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Room " + room.getRoomNumber() + " is bookable for: \n");
		for (Iterator<DayOfWeekTimeSpan> i = this.bookableTimes.iterator(); i.hasNext();) {
			DayOfWeekTimeSpan dow_ts = i.next();
			sb.append(dow_ts.toString() + "\n");
		}
		for (Iterator<Request> i = this.bookings.iterator(); i.hasNext();) {
			Request request = i.next();
			sb.append("\n");
			sb.append(request.toString() + "\n");
		}
		if(Arrays.toString(available)!="null") {
			sb.append(Arrays.toString(available) + "\n");
		}
		return sb.toString();
	}
}
