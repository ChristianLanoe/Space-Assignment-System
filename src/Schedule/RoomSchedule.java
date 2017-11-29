package Schedule;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import Request.Request;
import Room.Room;

//Class that refers to a room and the times it is able to be booked and the times it is booked

public class RoomSchedule implements Comparable<RoomSchedule> {
	private Room room;
//	private ArrayList<Request> bookings;		//ArrayList of approved requests
	private ArrayList<DayOfWeekTimeSpan> bookableTimesFall;//ArrayList of the availability times of the room per semester
	private ArrayList<DayOfWeekTimeSpan> bookableTimesWinter;
	private ArrayList<DayOfWeekTimeSpan> bookableTimesSummer;
	private boolean[] available;		//Boolean array for each hour block in a day

	public RoomSchedule(Room room) {
		this.room = room;
		this.bookableTimesFall = new ArrayList<DayOfWeekTimeSpan>();
		this.bookableTimesWinter = new ArrayList<DayOfWeekTimeSpan>();
		this.bookableTimesSummer = new ArrayList<DayOfWeekTimeSpan>();
//		this.bookings = new ArrayList<Request>();
	}


	//Populates a Boolean array of length 24 to represent booked or unbooked time slots
	public void populateAvailable(ArrayList<DayOfWeekTimeSpan> bookableTimes) {
		//Array created
		available = new boolean[24];
		//Iterate through to find when the given room can be booked
		for (DayOfWeekTimeSpan dow_ts : bookableTimes) {
			int start = dow_ts.getTimeSpan().getStartTime().getHour();
			int end = dow_ts.getTimeSpan().getEndTime().getHour();
			//Starting from the room start time, it changes the value to true until it reaches the room end time
			for (int i = start; i < end; i++) {
				available[i] = true;
			}
		}

//		//Iterates through the same array to fill in booked times
//		for (Request request : bookings) {
//			int start = request.getStartTime().getHour();
//			int end = request.getEndTime().getHour();
//			//Starting at the request start time, it changes the value to false until it reaches the request end time
//			for (int i = start; i < end; i++) {
//				available[i] = false;
//			}
//		}
	}
	
	public void addBookableTime(DayOfWeekTimeSpan span, int sem) {//TODO change int to semester type
		if(sem == 0){
			bookableTimesFall.add(span);
			Collections.sort(bookableTimesFall);
		}
		else if(sem == 1){
			bookableTimesWinter.add(span);
			Collections.sort(bookableTimesFall);
		}
		else if(sem == 2){
			bookableTimesSummer.add(span);
			Collections.sort(bookableTimesFall);
		}
	}

//	public void addBooking(Request request) {
//		bookings.add(request);
//		Collections.sort(bookings);
//	}

	public void addAvailable(boolean[] available) {
		this.available = available;
	}

	public boolean[] getAvailable(int sem) {
		if(sem == 0){
			populateAvailable(bookableTimesFall);
			return available;
		}
		else if(sem == 1){
			populateAvailable(bookableTimesWinter);
			return available;
		}
		else if(sem == 2){
			populateAvailable(bookableTimesSummer);
			return available;
		}
		else return null;
	}

	public ArrayList<DayOfWeekTimeSpan> getBookableTimes(int sem) {
		if(sem == 0){
			return bookableTimesFall;
		}
		else if(sem == 1){
			return bookableTimesWinter;
		}
		else if(sem == 2){
			return bookableTimesSummer;
		}
		else return null;
	}

//	public ArrayList<Request> getBookings() {
//		return bookings;
//	}

	public String getBookableTimesString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Room ").append(room.getRoomNumber());
		sb.append(" is bookable from: \n");
		for (Iterator<DayOfWeekTimeSpan> i = bookableTimesFall.iterator(); i.hasNext();) {
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

	public ArrayList<String> populateDay(ArrayList<DayOfWeekTimeSpan> bookableTimes, int day){
		ArrayList<String> times = null;
		DayOfWeekTimeSpan dow_ts = bookableTimes.get(day);
		LocalTime start = dow_ts.getTimeSpan().getStartTime();
		LocalTime end = dow_ts.getTimeSpan().getEndTime();
		LocalTime temp = start;
		
		while(temp.isBefore(end)){
			times.add(temp.toString());
			temp.plusHours(1);
		}
		return times;
		
	}
	
	// Returns a RoomSchedule for a specific date
	public RoomSchedule forDate(LocalDate date) {
		RoomSchedule daySchedule = new RoomSchedule(this.room);
		ArrayList<DayOfWeekTimeSpan> bookable;
		//TODO: Check which semester and generate the bookable from that
		if(date falls in fall semester){
			daySchedule.populateDay(bookableTimesFall, 0);
		}
		else if (date in winter semester){
			daySchedule.populateDay(bookableTimesWinter, 0);
		}
		else if (date in summer semester){
			daySchedule.populateDay(bookableTimesSummer, 0);
		}
		// Iterate through each element in bookableTimes
		for (Iterator<DayOfWeekTimeSpan> i = bookableTimesFall.iterator(); i.hasNext();) {
			DayOfWeekTimeSpan dow_ts = i.next();
			// Only add DayOfWeekTimeSpans that have the same day of week as the date
			if (dow_ts.getDayOfWeek() == date.getDayOfWeek()) {
				daySchedule.addBookableTime(dow_ts, 0);
			}
			// Since all DayOfWeekTimeSpans are sorted, once you find a DayOfWeek that is
			// greater than the date, you can stop iterating
			if (dow_ts.getDayOfWeek().getValue() > date.getDayOfWeek().getValue()) {
				break;
			}
		}
		
//		for (Iterator<Request> i = bookings.iterator(); i.hasNext();) {
//			Request request = i.next();
//			// Only add Requests that start on the same date as the date
//			// StartTime uses LocalDateTime, so we convert it to a LocalDate
//			if (request.getStartTime().toLocalDate().compareTo(date) == 0) {
//				daySchedule.addBooking(request);
//			}
//			// Requests are sorted by StartTime, same logic as above for DayOfWeekTimeSpans
//			if (request.getStartTime().toLocalDate().isAfter(date)) {
//				break;
//			}
//		}
		daySchedule.getAvailable(int sem);
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
		for (Iterator<DayOfWeekTimeSpan> i = this.bookableTimesFall.iterator(); i.hasNext();) {
			DayOfWeekTimeSpan dow_ts = i.next();
			sb.append(dow_ts.toString() + "\n");
		}
//		for (Iterator<Request> i = this.bookings.iterator(); i.hasNext();) {
//			Request request = i.next();
//			sb.append("\n");
//			sb.append(request.toString() + "\n");
//		}
		if(Arrays.toString(available)!="null") {
			sb.append(Arrays.toString(available) + "\n");
		}
		return sb.toString();
	}
}