package Schedule;

import java.time.DayOfWeek;

/*
	Class that contains the day of the week (Monday, Tuesday, Wednesday, etc.) and a time span
	Used for BookableTimes class
*/

public class DayOfWeekTimeSpan {
	private DayOfWeek dayOfWeek;
	private TimeSpan timeSpan;
	
	public DayOfWeekTimeSpan (DayOfWeek day, TimeSpan timeSpan) {
		this.dayOfWeek = day;
		this.timeSpan = timeSpan;
	}
	
	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}
	
	public void setDayOfWeek(DayOfWeek day) {
		this.dayOfWeek = day;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Day of Week: ");
		sb.append(dayOfWeek.toString());
		sb.append("\n");
		sb.append("From: ");
		sb.append(timeSpan.toString());
		
		return sb.toString();
	}
}
