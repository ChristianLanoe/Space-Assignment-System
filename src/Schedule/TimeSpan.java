package Schedule;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TimeSpan {
	private Calendar startTime;
	private Calendar endTime;
	
	public TimeSpan(Calendar startTime, Calendar endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Calendar getStartTime() {
		return startTime;
	}

	public void setStartTime(Calendar startTime) {
		this.startTime = startTime;
	}

	public Calendar getEndTime() {
		return endTime;
	}

	public void setEndTime(Calendar endTime) {
		this.endTime = endTime;
	}
	
	@Override
	public String toString() {
		DateFormat dayOfWeekTime = new SimpleDateFormat("EEEE, hh:mm a",Locale.CANADA);
		Date start = startTime.getTime();
		Date end = endTime.getTime();
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Time span: ");
		sb.append(dayOfWeekTime.format(start));
		sb.append(" to ");
		sb.append(dayOfWeekTime.format(end));
		
		return sb.toString();
	}
}
