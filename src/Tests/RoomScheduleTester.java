package Tests;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import Room.Amenity;
import Room.Room;
import Schedule.DayOfWeekTimeSpan;
import Schedule.RoomSchedule;
import Schedule.TimeSpan;

public class RoomScheduleTester {

	public static void main(String[] args) {
		ArrayList<Amenity> amenities = new ArrayList<Amenity>();
		amenities.add(Amenity.OverheadProjector);
		amenities.add(Amenity.TV);
		
		Room firstRoom = new Room(3001, 50, 40, 50);
		
		RoomSchedule rs = new RoomSchedule(firstRoom);
		
		
		LocalTime s1 = LocalTime.MIN.withHour(5); //Setting hours and minutes to Zero when setting Hour to 5
		LocalTime e1 = s1.plusHours(3);			//Setting e1 to s1 + 3 hours
		DayOfWeek day1 = DayOfWeek.MONDAY;
		
		TimeSpan span1 = new TimeSpan(s1,e1);
		DayOfWeekTimeSpan dts1 = new DayOfWeekTimeSpan(day1,span1);
		
		day1 = DayOfWeek.TUESDAY;
		DayOfWeekTimeSpan dts2 = new DayOfWeekTimeSpan(day1,span1);
		
		rs.addBookableTime(dts1);
		rs.addBookableTime(dts2);
		
		System.out.println(rs.getBookableTimesString());
	}
}
