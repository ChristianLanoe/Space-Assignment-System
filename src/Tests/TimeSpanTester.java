package Tests;

import java.time.LocalTime;

import Schedule.TimeSpan;

public class TimeSpanTester {
	private static int MINUTES = 0;
	public static void main(String[] args) {
		
		LocalTime startTime = LocalTime.of(0, MINUTES);
		LocalTime endTime = LocalTime.of(23, MINUTES);
		
		TimeSpan ts = new TimeSpan(startTime, endTime);
		System.out.println(ts.toString());
		System.out.print("Start Time: ");
		System.out.println(ts.getStartTime());
		System.out.print("End Time: ");
		System.out.println(ts.getEndTime());
	}
}
