package Schedule;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collections;

//Class for all Full_RoomSchedules
public class Full_Calendar implements Serializable {
	private int hoursInDay = 24;
	private int daysInWeek = 7;
	ArrayList<Full_RoomSchedule> schedules = new ArrayList<>();

	// null constructor
	public Full_Calendar() {
		schedules = new ArrayList<Full_RoomSchedule>();
	}

	public Full_Calendar(Full_RoomSchedule rs) {
		schedules = new ArrayList<Full_RoomSchedule>();
		schedules.add(rs);
	}

	public void addFullSchedule(Full_RoomSchedule rs) {
		schedules.add(rs);
		Collections.sort(schedules);
	}

	public ArrayList<Full_RoomSchedule> getCalendar() {
		return this.schedules;
	}

	// Gets the Semester_RoomSchedule
	public Semester_RoomSchedule forSemester(String room, SemesterType sType) {
		Semester_RoomSchedule result = new Semester_RoomSchedule(room, sType);

		// Iterate through all Full_RoomSchedules
		for (Full_RoomSchedule fullRS : schedules) {
			if (fullRS.getRoom().equals(room)) {
				result = fullRS.forSemester(sType);
			}
		}

		return result;
	}

	// Creates a 2D Boolean array each row is a day of the week and each column is
	// the hour block
	public Boolean[][] getAvailableTimes(String room, SemesterType sType) {
		Boolean[][] result = new Boolean[daysInWeek][hoursInDay];
		for (int i = 0; i < daysInWeek; i++) {
			for (Full_RoomSchedule full_rs : schedules) {
				if (full_rs.getRoom() == room) {
					result[i] = full_rs.getAvailable(DayOfWeek.of(i + 1), sType);
				}
				// schedules is sorted by room
				// if we come to a room that is after 'room' lexicographically, we can stop
				// iterating
				if (full_rs.getRoom().compareTo(room) == 1) {
					break;
				}
			}
		}
		return result;
	}

	// Serializing the Full_Calendar
	public void serialize() {
		try {
			FileOutputStream fos = new FileOutputStream("docs/fullSchedule.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this);
			oos.close();
			fos.close();
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Full_RoomSchedule rs : schedules) {
			sb.append(rs.toString()).append("\n");
		}
		return sb.toString();
	}
}
