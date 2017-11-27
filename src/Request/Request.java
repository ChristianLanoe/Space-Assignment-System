package Request;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Schedule.DayOfWeekTimeSpan;
import Utils.Contact;

public class Request extends Contact implements Comparable<Request>{
	private int roomNum;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private String description;
	private String id;
	private DayOfWeekTimeSpan[] pTimes;
	
	//Creates a Request object
	public Request(String FName, String LName,long phoneNumber, String eMail, int roomNum, String description, DayOfWeekTimeSpan[] pTimes) {
		super(FName, LName, phoneNumber, eMail);
		this.roomNum = roomNum;
		this.description = description;
		this.pTimes = pTimes;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public DayOfWeekTimeSpan[] getpTimes() {
		return pTimes;
	}

	public void setpTimes(DayOfWeekTimeSpan[] pTimes) {
		this.pTimes = pTimes;
	}
	
	//toString to print out the information of the Request object
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE MMMM dd,YYYY hh:mm a");
		sb.append("REQUEST\n");
		sb.append("-----------------------\n");
		sb.append("Room " + roomNum);
		sb.append("\n");
		sb.append("Start Time: " + dtf.format(startTime));
		sb.append("\n");
		sb.append("End Time: " + dtf.format(endTime));
		
		return sb.toString();
	}
	
	//compareTo to order the Request objects by start time
	@Override
	public int compareTo(Request request) {
		if(this.getRoomNum() == request.getRoomNum()) {
			return this.pTimes[0].getTimeSpan().getStartTime().compareTo(request.pTimes[0].getTimeSpan().getStartTime());
		}
		return this.getRoomNum()-request.getRoomNum();
	}
}
