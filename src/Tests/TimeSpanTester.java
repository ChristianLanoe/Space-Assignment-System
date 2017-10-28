package Tests;

import Schedule.TimeSpan;

import java.util.Calendar;

public class TimeSpanTester {
	
	public static void main(String[] args) {
		
		Calendar startTime = Calendar.getInstance();
		Calendar endTime = Calendar.getInstance();
		
		startTime.set(Calendar.HOUR, 9);
		startTime.set(Calendar.MINUTE, 0);
		startTime.set(Calendar.AM_PM, Calendar.AM);
		startTime.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		
		endTime.set(Calendar.HOUR, 10);
		endTime.set(Calendar.MINUTE,0);
		endTime.set(Calendar.AM_PM, Calendar.AM);
		endTime.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		
		TimeSpan newTime = new TimeSpan(startTime,endTime);
		System.out.println(newTime.toString());	
	}
}
