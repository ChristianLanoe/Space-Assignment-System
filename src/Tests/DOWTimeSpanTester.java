package Tests;

import java.time.DayOfWeek;
import java.time.LocalTime;

import Schedule.DayOfWeekTimeSpan;
import Schedule.TimeSpan;

public class DOWTimeSpanTester {
	private static int MINUTES; 
	public static void main(String[] args) {
		LocalTime startTime = LocalTime.of(9,MINUTES);
		LocalTime endTime = LocalTime.of(15, MINUTES);
		
		TimeSpan ts = new TimeSpan(startTime,endTime);
		
		
		DayOfWeekTimeSpan dowts = new DayOfWeekTimeSpan(DayOfWeek.MONDAY, ts);
		System.out.println(dowts.toString());
	}
}
