package Schedule;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class TimeSpan implements Serializable {
	private LocalTime startTime;
	private LocalTime endTime;

	// Creates TimeSpan object
	public TimeSpan(LocalTime startTime, LocalTime endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public TimeSpan() {
	}

	public TimeSpan(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setStartTime(LocalTime start) {
		this.startTime = start;
	}

	public void setEndtime(LocalTime end) {
		this.endTime = end;
	}

	public boolean startsBefore(TimeSpan span) {
		return startTime.isBefore(span.getStartTime());
	}

	// toString to print out the information of the TimeSpan object
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DateTimeFormatter dtf = new DateTimeFormatterBuilder().appendPattern("hh:mm a").toFormatter();
		sb.append(dtf.format(startTime));
		sb.append(" to ");
		sb.append(dtf.format(endTime));

		return sb.toString();
	}
}
