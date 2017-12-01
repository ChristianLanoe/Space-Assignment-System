package Schedule;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Class for RoomSchedule for one semester (Fall,Winter or Summer)
public class Semester_RoomSchedule implements Serializable, Comparable<Semester_RoomSchedule> {
	private int hoursInDay = 24;
	private String room;
	private ArrayList<DayOfWeekTimeSpan> sem_schedule;
	private SemesterType semesterType;

	public Semester_RoomSchedule(String room, SemesterType type) {
		this.room = room;
		this.semesterType = type;
		this.sem_schedule = new ArrayList<DayOfWeekTimeSpan>();
	}

	public Semester_RoomSchedule(String room, ArrayList<DayOfWeekTimeSpan> schedule) {
		this.room = room;
		this.sem_schedule = schedule;
	}

	public void addRoomSchedule(DayOfWeekTimeSpan span) {
		this.sem_schedule.add(span);
		Collections.sort(sem_schedule);
	}

	public ArrayList<DayOfWeekTimeSpan> getRoomSchedule() {
		return this.sem_schedule;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getRoom() {
		return this.room;
	}

	public void setSemesterType(SemesterType type) {
		this.semesterType = type;
	}

	public SemesterType getSemesterType() {
		return this.semesterType;
	}

	// each element in this Boolean array represents a 1 hour block starting at the
	// hour of the index
	// Iterate through all the DayOfWeekTimeSpans
	// For each span check if the DayOfWeek is equal to 'day'
	// If equal, get the start and end time of the span
	// Set all array indexes from start time to end time true
	public Boolean[] availableTimes(DayOfWeek day) {
		Boolean[] result = new Boolean[hoursInDay];
		Arrays.fill(result, Boolean.FALSE);
		for (DayOfWeekTimeSpan span : sem_schedule) {
			if (span.getDayOfWeek().compareTo(day) == 0) {
				int start = span.getTimeSpan().getStartTime().getHour();
				int end = span.getTimeSpan().getEndTime().getHour();
				for (int i = start; i < end; i++) {
					result[i] = true;
				}
			}
			// sem_schedule is sorted by DayOfWeek (Mon -> Sun)
			// if we come to a DayOfWeek greater than 'day' we can stop iterating
			if (span.getDayOfWeek().compareTo(day) == 1) {
				break;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Room: ").append(room).append("\n");
		sb.append("Semester: ").append(semesterType).append("\n");

		for (DayOfWeekTimeSpan spans : sem_schedule) {
			sb.append(spans.toString()).append("\n");
		}
		return sb.toString();
	}

	// Sort Semester_RoomSchedules by roomName then SemesterType
	@Override
	public int compareTo(Semester_RoomSchedule rs) {
		if (!this.room.equalsIgnoreCase(rs.getRoom())) {
			return this.room.toLowerCase().compareTo(rs.getRoom().toLowerCase());
		}
		if (!(semesterType.equals(rs.getSemesterType()))) {
			return this.semesterType.compareTo(rs.getSemesterType());
		}
		return 0;
	}
}
