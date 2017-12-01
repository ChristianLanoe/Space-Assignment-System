package Schedule;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collections;

// RoomSchedule Class that has the roomSchedule for each semester (Fall,Winter,Summer)
public class Full_RoomSchedule implements Serializable, Comparable<Full_RoomSchedule>{ 
	private int hoursInDay = 24;
	private String room;
	private ArrayList<Semester_RoomSchedule> semester_schedules;
	
	public Full_RoomSchedule (String room) {
		this.room = room;
		this.semester_schedules = new ArrayList<Semester_RoomSchedule>();
	}
	
	public Full_RoomSchedule (String room, ArrayList<Semester_RoomSchedule> sem) {
		this.room = room;
		this.semester_schedules = sem;
	}
	
	public void addSemesterSchedules(Semester_RoomSchedule sem) {
		this.semester_schedules.add(sem);
		Collections.sort(semester_schedules);
	}
	
	public ArrayList<Semester_RoomSchedule> getSemesterSchedule() {
		return this.semester_schedules;
	}
	
	public void setRoom(String room) {
		this.room = room;
	}
	
	public String getRoom() {
		return this.room;
	}
	
	public Semester_RoomSchedule forSemester(SemesterType type) {
		return semester_schedules.get(type.getValue());
	}
	
	public Boolean[] getAvailable(DayOfWeek day,SemesterType type) {
		Boolean[] result = new Boolean[hoursInDay];
		result = forSemester(type).availableTimes(day);
		
		return result;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(Semester_RoomSchedule schedule: semester_schedules) {
			sb.append(schedule.toString());
		}
		
		return sb.toString();
	}

	@Override
	public int compareTo(Full_RoomSchedule rs) {
		if(!room.equalsIgnoreCase(rs.getRoom())) {
			return room.toLowerCase().compareTo(rs.getRoom().toLowerCase());
		}
		
		return 0;
	}
}
