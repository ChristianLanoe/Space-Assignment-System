package Schedule;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateTime_TimeSpan {
	private LocalDateTime startDateTime;
	private LocalDateTime endDateTime;

	public DateTime_TimeSpan(LocalDateTime startDateTime, LocalDateTime endDateTime){
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
	}
	
	public DateTime_TimeSpan(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
		this.endDateTime = null;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DateTimeFormatter dtf = new DateTimeFormatterBuilder().appendPattern("EEEE dd-MMMM-YYYY hh:mm a").toFormatter();

		sb.append(dtf.format(startDateTime));
		sb.append("\n");
		sb.append(dtf.format(endDateTime));
		
		return sb.toString();
	}
}
