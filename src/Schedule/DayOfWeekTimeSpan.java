package Schedule;

import java.time.DayOfWeek;

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
		sb.append(dayOfWeek.toString());
		sb.append("\n");
		sb.append(timeSpan.toString());
		return sb.toString();
	}
}
