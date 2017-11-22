package Schedule;

import java.time.DayOfWeek;

/*
	Class that contains the day of the week (Monday, Tuesday, Wednesday, etc.) and a time span
	Used for BookableTimes class
*/

public class DayOfWeekTimeSpan implements Comparable<DayOfWeekTimeSpan>{
	private DayOfWeek dayOfWeek;
	private TimeSpan timeSpan;
	
	/* Creates a DayOfWeekTimeSpan object 
	 * to hold the time a room is available
	 * for each day of the week
	 */
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
	
	public TimeSpan getTimeSpan() {
		return this.timeSpan;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(dayOfWeek.toString());
		sb.append(" From: ");
		sb.append(timeSpan.toString());
		
		return sb.toString();
	}

	@Override
	public int compareTo(DayOfWeekTimeSpan week_ts) {
		int compareDay = week_ts.getDayOfWeek().getValue();
		if(this.dayOfWeek.getValue()-compareDay == 0) {
			return this.timeSpan.getStartTime().compareTo(week_ts.getTimeSpan().getStartTime());
		}
		return this.dayOfWeek.getValue()-compareDay;
	}
}
