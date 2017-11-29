package Tests;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import Request.Request;
import Room.Room;
import Room.RoomDB;
import Schedule.Calendar;
import Schedule.DayOfWeekTimeSpan;
import Schedule.RoomSchedule;
import Schedule.SemesterType;
import Schedule.TimeSpan;

public class MakeRoomSchedules {
	public static void main(String[] args) {
		int MINUTE = 0;
		
		//Creating Rooms
		Room a = new Room(1,"Gym",400,94,60);
		Room b = new Room(2,"Library",200,94,60);
		Room c = new Room(3,"Cafeteria",500,90,60);
		Room d = new Room(4,"Computer Lab",40,60,60);
		Room e = new Room(5,"Board Room",25,50,50);
		
		RoomDB rooms = new RoomDB();
		rooms.addRoom(a);
		rooms.addRoom(b);
		rooms.addRoom(c);
		rooms.addRoom(d);
		rooms.addRoom(e);
		
		//Creating bookableTimes for Room 4060
		RoomSchedule a_schedule = new RoomSchedule(a);
		LocalTime a_startTime =  LocalTime.of(6, MINUTE);
		LocalTime a_endTime = LocalTime.of(23, MINUTE);
		TimeSpan a_ts = new TimeSpan(a_startTime,a_endTime);
		DayOfWeekTimeSpan a_M = new DayOfWeekTimeSpan(DayOfWeek.MONDAY, a_ts);
		DayOfWeekTimeSpan a_T = new DayOfWeekTimeSpan(DayOfWeek.TUESDAY, a_ts);
		DayOfWeekTimeSpan a_W = new DayOfWeekTimeSpan(DayOfWeek.WEDNESDAY, a_ts);
		DayOfWeekTimeSpan a_R = new DayOfWeekTimeSpan(DayOfWeek.THURSDAY, a_ts);
		DayOfWeekTimeSpan a_F = new DayOfWeekTimeSpan(DayOfWeek.FRIDAY, a_ts);
		DayOfWeekTimeSpan a_S = new DayOfWeekTimeSpan(DayOfWeek.SATURDAY, a_ts);
		DayOfWeekTimeSpan a_Su = new DayOfWeekTimeSpan(DayOfWeek.SUNDAY, a_ts);
		
		a_schedule.addBookableTime(a_F,SemesterType.FALL);
		a_schedule.addBookableTime(a_T,SemesterType.FALL);
		a_schedule.addBookableTime(a_W,SemesterType.FALL);
		a_schedule.addBookableTime(a_Su,SemesterType.FALL);
		a_schedule.addBookableTime(a_M,SemesterType.FALL);
		a_schedule.addBookableTime(a_S,SemesterType.FALL);
		a_schedule.addBookableTime(a_R,SemesterType.FALL);
		
		a_schedule.addBookableTime(a_F,SemesterType.WINTER);
		a_schedule.addBookableTime(a_T,SemesterType.WINTER);
		a_schedule.addBookableTime(a_W,SemesterType.WINTER);
		a_schedule.addBookableTime(a_Su,SemesterType.WINTER);
		a_schedule.addBookableTime(a_M,SemesterType.WINTER);
		a_schedule.addBookableTime(a_S,SemesterType.WINTER);
		a_schedule.addBookableTime(a_R,SemesterType.WINTER);
		
		a_schedule.addBookableTime(a_F,SemesterType.SUMMER);
		a_schedule.addBookableTime(a_T,SemesterType.SUMMER);
		a_schedule.addBookableTime(a_W,SemesterType.SUMMER);
		a_schedule.addBookableTime(a_Su,SemesterType.SUMMER);
		a_schedule.addBookableTime(a_M,SemesterType.SUMMER);
		a_schedule.addBookableTime(a_S,SemesterType.SUMMER);
		a_schedule.addBookableTime(a_R,SemesterType.SUMMER);

		//Creating bookableTimes for Room 3052
		RoomSchedule b_schedule = new RoomSchedule(b);
		LocalTime b_startTime =  LocalTime.of(9, MINUTE);
		LocalTime b_endTime = LocalTime.of(17, MINUTE);
		TimeSpan b_ts = new TimeSpan(b_startTime,b_endTime);
		DayOfWeekTimeSpan b_M = new DayOfWeekTimeSpan(DayOfWeek.MONDAY, b_ts);
		DayOfWeekTimeSpan b_T = new DayOfWeekTimeSpan(DayOfWeek.TUESDAY, b_ts);
		DayOfWeekTimeSpan b_W = new DayOfWeekTimeSpan(DayOfWeek.WEDNESDAY, b_ts);
		DayOfWeekTimeSpan b_R = new DayOfWeekTimeSpan(DayOfWeek.THURSDAY, b_ts);
		DayOfWeekTimeSpan b_F = new DayOfWeekTimeSpan(DayOfWeek.FRIDAY, b_ts);
		DayOfWeekTimeSpan b_S = new DayOfWeekTimeSpan(DayOfWeek.SATURDAY, b_ts);
		DayOfWeekTimeSpan b_Su = new DayOfWeekTimeSpan(DayOfWeek.SUNDAY, b_ts);
		
		b_schedule.addBookableTime(b_M,SemesterType.FALL);
		b_schedule.addBookableTime(b_T,SemesterType.FALL);
		b_schedule.addBookableTime(b_W,SemesterType.FALL);
		b_schedule.addBookableTime(b_R,SemesterType.FALL);
		b_schedule.addBookableTime(b_F,SemesterType.FALL);
		b_schedule.addBookableTime(b_S,SemesterType.FALL);
		b_schedule.addBookableTime(b_Su,SemesterType.FALL);
		
		b_schedule.addBookableTime(b_M,SemesterType.WINTER);
		b_schedule.addBookableTime(b_T,SemesterType.WINTER);
		b_schedule.addBookableTime(b_W,SemesterType.WINTER);
		b_schedule.addBookableTime(b_R,SemesterType.WINTER);
		b_schedule.addBookableTime(b_F,SemesterType.WINTER);
		b_schedule.addBookableTime(b_S,SemesterType.WINTER);
		b_schedule.addBookableTime(b_Su,SemesterType.WINTER);
		
		b_schedule.addBookableTime(b_M,SemesterType.SUMMER);
		b_schedule.addBookableTime(b_T,SemesterType.SUMMER);
		b_schedule.addBookableTime(b_W,SemesterType.SUMMER);
		b_schedule.addBookableTime(b_R,SemesterType.SUMMER);
		b_schedule.addBookableTime(b_F,SemesterType.SUMMER);
		b_schedule.addBookableTime(b_S,SemesterType.SUMMER);
		b_schedule.addBookableTime(b_Su,SemesterType.SUMMER);
		
		//Creating RoomSchedule for Room 2042
		RoomSchedule c_schedule = new RoomSchedule(c);
		LocalTime c_startTime =  LocalTime.of(9, MINUTE);
		LocalTime c_endTime = LocalTime.of(17, MINUTE);
		TimeSpan c_ts = new TimeSpan(c_startTime,c_endTime);
		TimeSpan c_weekend = new TimeSpan(LocalTime.of(6, MINUTE),LocalTime.of(18, MINUTE));
		DayOfWeekTimeSpan c_M = new DayOfWeekTimeSpan(DayOfWeek.MONDAY, c_ts);
		DayOfWeekTimeSpan c_T = new DayOfWeekTimeSpan(DayOfWeek.TUESDAY, c_ts);
		DayOfWeekTimeSpan c_W = new DayOfWeekTimeSpan(DayOfWeek.WEDNESDAY, c_ts);
		DayOfWeekTimeSpan c_R = new DayOfWeekTimeSpan(DayOfWeek.THURSDAY, c_ts);
		DayOfWeekTimeSpan c_F = new DayOfWeekTimeSpan(DayOfWeek.FRIDAY, c_ts);
		DayOfWeekTimeSpan c_S = new DayOfWeekTimeSpan(DayOfWeek.SATURDAY, c_weekend);
		DayOfWeekTimeSpan c_Su = new DayOfWeekTimeSpan(DayOfWeek.SUNDAY, c_weekend);
		
		c_schedule.addBookableTime(c_M,SemesterType.FALL);
		c_schedule.addBookableTime(c_T,SemesterType.FALL);
		c_schedule.addBookableTime(c_W,SemesterType.FALL);
		c_schedule.addBookableTime(c_R,SemesterType.FALL);
		c_schedule.addBookableTime(c_F,SemesterType.FALL);
		c_schedule.addBookableTime(c_S,SemesterType.FALL);
		c_schedule.addBookableTime(c_Su,SemesterType.FALL);
		
		c_schedule.addBookableTime(c_M,SemesterType.WINTER);
		c_schedule.addBookableTime(c_T,SemesterType.WINTER);
		c_schedule.addBookableTime(c_W,SemesterType.WINTER);
		c_schedule.addBookableTime(c_R,SemesterType.WINTER);
		c_schedule.addBookableTime(c_F,SemesterType.WINTER);
		c_schedule.addBookableTime(c_S,SemesterType.WINTER);
		c_schedule.addBookableTime(c_Su,SemesterType.WINTER);
		
		c_schedule.addBookableTime(c_M,SemesterType.SUMMER);
		c_schedule.addBookableTime(c_T,SemesterType.SUMMER);
		c_schedule.addBookableTime(c_W,SemesterType.SUMMER);
		c_schedule.addBookableTime(c_R,SemesterType.SUMMER);
		c_schedule.addBookableTime(c_F,SemesterType.SUMMER);
		c_schedule.addBookableTime(c_S,SemesterType.SUMMER);
		c_schedule.addBookableTime(c_Su,SemesterType.SUMMER);
		
		//Creating RoomSchedule for Room 1040
		RoomSchedule d_schedule = new RoomSchedule(d);
		LocalTime d_startTime =  LocalTime.of(9, MINUTE);
		LocalTime d_endTime = LocalTime.of(12, MINUTE);
		TimeSpan d_ts = new TimeSpan(d_startTime,d_endTime);
		TimeSpan d_weekend= new TimeSpan(LocalTime.of(6, MINUTE),LocalTime.of(18, MINUTE));
		DayOfWeekTimeSpan d_M = new DayOfWeekTimeSpan(DayOfWeek.MONDAY, d_ts);
		DayOfWeekTimeSpan d_M1 = new DayOfWeekTimeSpan(DayOfWeek.MONDAY, new TimeSpan(LocalTime.of(13, MINUTE),LocalTime.of(23, MINUTE)));
		DayOfWeekTimeSpan d_T = new DayOfWeekTimeSpan(DayOfWeek.TUESDAY, d_ts);
		DayOfWeekTimeSpan d_W = new DayOfWeekTimeSpan(DayOfWeek.WEDNESDAY, d_ts);
		DayOfWeekTimeSpan d_W1 = new DayOfWeekTimeSpan(DayOfWeek.WEDNESDAY, new TimeSpan(LocalTime.of(13, MINUTE),LocalTime.of(23, MINUTE)));
		DayOfWeekTimeSpan d_R = new DayOfWeekTimeSpan(DayOfWeek.THURSDAY, d_ts);
		DayOfWeekTimeSpan d_F = new DayOfWeekTimeSpan(DayOfWeek.FRIDAY, d_ts);
		DayOfWeekTimeSpan d_F1 = new DayOfWeekTimeSpan(DayOfWeek.FRIDAY, new TimeSpan(LocalTime.of(13, MINUTE),LocalTime.of(23, MINUTE)));
		DayOfWeekTimeSpan d_S = new DayOfWeekTimeSpan(DayOfWeek.SATURDAY, d_weekend);
		DayOfWeekTimeSpan d_Su = new DayOfWeekTimeSpan(DayOfWeek.SUNDAY, d_weekend);
		
		d_schedule.addBookableTime(d_M1,SemesterType.FALL);
		d_schedule.addBookableTime(d_T,SemesterType.FALL);
		d_schedule.addBookableTime(d_M,SemesterType.FALL);
		d_schedule.addBookableTime(d_W,SemesterType.FALL);
		d_schedule.addBookableTime(d_W1,SemesterType.FALL);
		d_schedule.addBookableTime(d_R,SemesterType.FALL);
		d_schedule.addBookableTime(d_S,SemesterType.FALL);
		d_schedule.addBookableTime(d_F1,SemesterType.FALL);
		d_schedule.addBookableTime(d_F,SemesterType.FALL);
		d_schedule.addBookableTime(d_Su,SemesterType.FALL);
		
		d_schedule.addBookableTime(d_M1,SemesterType.WINTER);
		d_schedule.addBookableTime(d_T,SemesterType.WINTER);
		d_schedule.addBookableTime(d_M,SemesterType.WINTER);
		d_schedule.addBookableTime(d_W,SemesterType.WINTER);
		d_schedule.addBookableTime(d_W1,SemesterType.WINTER);
		d_schedule.addBookableTime(d_R,SemesterType.WINTER);
		d_schedule.addBookableTime(d_S,SemesterType.WINTER);
		d_schedule.addBookableTime(d_F1,SemesterType.WINTER);
		d_schedule.addBookableTime(d_F,SemesterType.WINTER);
		d_schedule.addBookableTime(d_Su,SemesterType.WINTER);
		
		d_schedule.addBookableTime(d_M1,SemesterType.SUMMER);
		d_schedule.addBookableTime(d_T,SemesterType.SUMMER);
		d_schedule.addBookableTime(d_M,SemesterType.SUMMER);
		d_schedule.addBookableTime(d_W,SemesterType.SUMMER);
		d_schedule.addBookableTime(d_W1,SemesterType.SUMMER);
		d_schedule.addBookableTime(d_R,SemesterType.SUMMER);
		d_schedule.addBookableTime(d_S,SemesterType.SUMMER);
		d_schedule.addBookableTime(d_F1,SemesterType.SUMMER);
		d_schedule.addBookableTime(d_F,SemesterType.SUMMER);
		d_schedule.addBookableTime(d_Su,SemesterType.SUMMER);
	
		//Creating RoomSchedule for Room 3010
		RoomSchedule e_schedule = new RoomSchedule(e);
		LocalTime e_startTime =  LocalTime.of(9, MINUTE);
		LocalTime e_endTime = LocalTime.of(23, MINUTE);
		TimeSpan e_ts = new TimeSpan(e_startTime,e_endTime);
		TimeSpan e_weekend = new TimeSpan(LocalTime.of(6, MINUTE),LocalTime.of(18, MINUTE));
		DayOfWeekTimeSpan e_M = new DayOfWeekTimeSpan(DayOfWeek.MONDAY, e_ts);
		DayOfWeekTimeSpan e_T = new DayOfWeekTimeSpan(DayOfWeek.TUESDAY, e_ts);
		DayOfWeekTimeSpan e_W = new DayOfWeekTimeSpan(DayOfWeek.WEDNESDAY, e_ts);
		DayOfWeekTimeSpan e_R = new DayOfWeekTimeSpan(DayOfWeek.THURSDAY, e_ts);
		DayOfWeekTimeSpan e_F = new DayOfWeekTimeSpan(DayOfWeek.FRIDAY, e_ts);
		DayOfWeekTimeSpan e_S = new DayOfWeekTimeSpan(DayOfWeek.SATURDAY, e_weekend);
		DayOfWeekTimeSpan e_Su = new DayOfWeekTimeSpan(DayOfWeek.SUNDAY, e_weekend);
		
		e_schedule.addBookableTime(e_M,SemesterType.FALL);
		e_schedule.addBookableTime(e_T,SemesterType.FALL);
		e_schedule.addBookableTime(e_W,SemesterType.FALL);
		e_schedule.addBookableTime(e_R,SemesterType.FALL);
		e_schedule.addBookableTime(e_F,SemesterType.FALL);
		e_schedule.addBookableTime(e_S,SemesterType.FALL);
		e_schedule.addBookableTime(e_Su,SemesterType.FALL);
		
		e_schedule.addBookableTime(e_M,SemesterType.WINTER);
		e_schedule.addBookableTime(e_T,SemesterType.WINTER);
		e_schedule.addBookableTime(e_W,SemesterType.WINTER);
		e_schedule.addBookableTime(e_R,SemesterType.WINTER);
		e_schedule.addBookableTime(e_F,SemesterType.WINTER);
		e_schedule.addBookableTime(e_S,SemesterType.WINTER);
		e_schedule.addBookableTime(e_Su,SemesterType.WINTER);
		
		
		e_schedule.addBookableTime(e_M,SemesterType.SUMMER);
		e_schedule.addBookableTime(e_T,SemesterType.SUMMER);
		e_schedule.addBookableTime(e_W,SemesterType.SUMMER);
		e_schedule.addBookableTime(e_R,SemesterType.SUMMER);
		e_schedule.addBookableTime(e_F,SemesterType.SUMMER);
		e_schedule.addBookableTime(e_S,SemesterType.SUMMER);
		e_schedule.addBookableTime(e_Su,SemesterType.SUMMER);
		
		//Adding roomSchedules to Calendar
		Calendar  cal = new Calendar();
		cal.addRoomSchedule(a_schedule);
		cal.addRoomSchedule(b_schedule);
		cal.addRoomSchedule(c_schedule);
		cal.addRoomSchedule(d_schedule);
		cal.addRoomSchedule(e_schedule);
		
		//LocalDateTimes for a request
		LocalDateTime as = LocalDateTime.of(2017, 11, 22, 10, MINUTE);
		LocalDateTime ae = LocalDateTime.of(2017, 11, 22, 12, MINUTE);	
		
		System.out.println("=================================================");
		System.out.println("Printing out whole calendar");
		System.out.println("=================================================");
		System.out.println(cal.toString());
		
		System.out.println("=================================================");
		System.out.println("Printing out whole Schedule for room 1040:");
		System.out.println("=================================================");
		System.out.println(cal.getRoomScheduleString(1));
		
		System.out.println("=================================================");
		System.out.println("Printing bookable times for Room 1040:");
		System.out.println("=================================================");
		System.out.println(cal.getRoomSchedule(1).getBookableTimesString());
		
		System.out.println("=================================================");
		LocalDate now = LocalDate.now().plusDays(1);
		DayOfWeek dayOfWeek = now.getDayOfWeek();
		System.out.println("Calendar for " + dayOfWeek + " " + now + ":");
		System.out.println("=================================================");
		System.out.print(cal.forDate(LocalDate.now()).toString());
		
	}
}
