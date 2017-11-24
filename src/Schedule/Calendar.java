package Schedule;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Class for Handling all the room schedules
public class Calendar {
	private ArrayList<RoomSchedule> calendar;

	public Calendar() {
		calendar = new ArrayList<RoomSchedule>();
	}

	public void addRoomSchedule(RoomSchedule rs) {
		calendar.add(rs);
		Collections.sort(calendar);
	}

	public void removeRoomSchedule(RoomSchedule rs) {
		calendar.remove(rs);
	}
	
	
	public Calendar forDate(LocalDate date) {
		Calendar dateCalendar = new Calendar();
		for(Iterator<RoomSchedule> i = calendar.iterator(); i.hasNext();) {
			RoomSchedule rs = i.next();
			RoomSchedule dateSchedule = rs.forDate(date);
			if(!dateSchedule.getBookableTimes().isEmpty()) {
				dateCalendar.addRoomSchedule(dateSchedule);			
			}
		}
		return dateCalendar;
	}
	
	public int getLength() {
		return calendar.size();
	}

	public Integer[] getRoomArray(Calendar cal) {
		Integer[] result = new Integer[cal.getLength()];
		
		for(int i = 0; i<cal.getLength();i++) {
			result[i] = Integer.valueOf(cal.calendar.get(i).getRoom().getRoomNumber());
		}
		
		return result;
	}
	
	public Boolean[][] getDateArray(Calendar cal){
//		Calendar forDate = cal.forDate(date);
		boolean[] temp = new boolean[24];
		Boolean[][] result = new Boolean[cal.getLength()][24];
		
		for(int i = 0; i<cal.getLength();i++) {
			temp = cal.calendar.get(i).getAvailable();
			for(int j = 0; j<temp.length;j++) {
				result[i][j] = Boolean.valueOf(temp[j]);
			}
		}
		return result;
	}
	
	//returns a string of all the rooms, their bookable times and their approved requests
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Iterator<RoomSchedule> i = calendar.iterator(); i.hasNext();) {
			RoomSchedule rs = i.next();
			sb.append(rs.toString() + "\n");
		}
		return sb.toString();
	}

	//returns the RoomSchedule of a specific Room
	public RoomSchedule getRoomSchedule(int roomNumber) {
		for (Iterator<RoomSchedule> i = calendar.iterator(); i.hasNext();) {
			RoomSchedule rs = i.next();
			if (rs.getRoom().getRoomNumber() == roomNumber) {
				return rs;
			}
		}
		return null;
	}
	
	//returns a String of the bookable times and approved requests for a specific room
	public String getRoomScheduleString(int roomNumber) {
		for (Iterator<RoomSchedule> i = calendar.iterator(); i.hasNext();) {
			RoomSchedule rs = i.next();
			if (rs.getRoom().getRoomNumber() == roomNumber) {
				return rs.toString();
			}
		}
		return "";
	}
}
