package Tests;

import java.time.DayOfWeek;
import java.time.LocalTime;

import Room.Room;
import Schedule.Calendar;
import Schedule.DayOfWeekTimeSpan;
import Schedule.RoomSchedule;
import Schedule.TimeSpan;

public class MakeRoomSchedules {
	public static void main(String[] args) {
		int MINUTE = 0;
		
		//Creating Rooms
		Room a = new Room(4060,50,34,40);
		Room b = new Room(3052,50,40,40);
		Room c = new Room(2042,40,60,60);
		Room d = new Room(1040,30,45,60);
		Room e = new Room(3010,75,50,50);
		Room f = new Room(4012,25,30,60);
		
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
		
		a_schedule.addBookableTime(a_M);
		a_schedule.addBookableTime(a_T);
		a_schedule.addBookableTime(a_W);
		a_schedule.addBookableTime(a_R);
		a_schedule.addBookableTime(a_F);
		a_schedule.addBookableTime(a_S);
		a_schedule.addBookableTime(a_Su);

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
		
		b_schedule.addBookableTime(b_M);
		b_schedule.addBookableTime(b_T);
		b_schedule.addBookableTime(b_W);
		b_schedule.addBookableTime(b_R);
		b_schedule.addBookableTime(b_F);
		b_schedule.addBookableTime(b_S);
		b_schedule.addBookableTime(b_Su);
		
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
		
		c_schedule.addBookableTime(c_M);
		c_schedule.addBookableTime(c_T);
		c_schedule.addBookableTime(c_W);
		c_schedule.addBookableTime(c_R);
		c_schedule.addBookableTime(c_F);
		c_schedule.addBookableTime(c_S);
		c_schedule.addBookableTime(c_Su);
		
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
		
		d_schedule.addBookableTime(d_M1);
		d_schedule.addBookableTime(d_T);
		d_schedule.addBookableTime(d_M);
		d_schedule.addBookableTime(d_W);
		d_schedule.addBookableTime(d_W1);
		d_schedule.addBookableTime(d_R);
		d_schedule.addBookableTime(d_S);
		d_schedule.addBookableTime(d_F1);
		d_schedule.addBookableTime(d_F);
		d_schedule.addBookableTime(d_Su);
	
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
		
		e_schedule.addBookableTime(e_M);
		e_schedule.addBookableTime(e_T);
		e_schedule.addBookableTime(e_W);
		e_schedule.addBookableTime(e_R);
		e_schedule.addBookableTime(e_F);
		e_schedule.addBookableTime(e_S);
		e_schedule.addBookableTime(e_Su);
		
		//Creating RoomSchedule for Room 4012
		RoomSchedule f_schedule = new RoomSchedule(f);
		LocalTime f_startTime =  LocalTime.of(9, MINUTE);
		LocalTime f_endTime = LocalTime.of(17, MINUTE);
		TimeSpan f_ts = new TimeSpan(f_startTime,f_endTime);
		TimeSpan f_weekend = new TimeSpan(LocalTime.of(6, MINUTE),LocalTime.of(18, MINUTE));
		DayOfWeekTimeSpan f_M = new DayOfWeekTimeSpan(DayOfWeek.MONDAY, f_ts);
		DayOfWeekTimeSpan f_T = new DayOfWeekTimeSpan(DayOfWeek.TUESDAY, f_ts);
		DayOfWeekTimeSpan f_W = new DayOfWeekTimeSpan(DayOfWeek.WEDNESDAY, f_ts);
		DayOfWeekTimeSpan f_R = new DayOfWeekTimeSpan(DayOfWeek.THURSDAY, f_ts);
		DayOfWeekTimeSpan f_F = new DayOfWeekTimeSpan(DayOfWeek.FRIDAY, f_ts);
		DayOfWeekTimeSpan f_S = new DayOfWeekTimeSpan(DayOfWeek.SATURDAY, f_weekend);
		DayOfWeekTimeSpan f_Su = new DayOfWeekTimeSpan(DayOfWeek.SUNDAY, f_weekend);
		
		f_schedule.addBookableTime(f_M);
		f_schedule.addBookableTime(f_T);
		f_schedule.addBookableTime(f_W);
		f_schedule.addBookableTime(f_R);
		f_schedule.addBookableTime(f_F);
		f_schedule.addBookableTime(f_S);
		f_schedule.addBookableTime(f_Su);
		
		//Adding roomSchedules to Calendar
		Calendar  cal = new Calendar();
		cal.addRoomSchedule(a_schedule);
		cal.addRoomSchedule(b_schedule);
		cal.addRoomSchedule(c_schedule);
		cal.addRoomSchedule(d_schedule);
		cal.addRoomSchedule(e_schedule);
		cal.addRoomSchedule(f_schedule);
		
		System.out.println("Printing out whole calendar (Requests not implemented yet)");
		System.out.println();
		System.out.println(cal.toString());
		System.out.println(cal.getRoomScheduleString(4012));
		
		System.out.println(cal.getRoomSchedule(3010).getBookableTimesString());
		
	}
}
