package Request;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Utils.Contact;

public class Request extends Contact implements Comparable<Request>{
	private int roomNum;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private String description;
	private String id;
	
	public Request(String FName, String LName,long phoneNumber, String eMail, int roomNum, LocalDateTime startTime, LocalDateTime endTime, String description) {
		super(FName, LName, phoneNumber, eMail);
		this.roomNum = roomNum;
		this.startTime = startTime;
		this.endTime = endTime;
		this.description = description;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
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
	
	@Override
	public int compareTo(Request request) {
		if(this.getRoomNum() == request.getRoomNum()) {
			return this.getStartTime().compareTo(request.getStartTime());
		}
		return this.getRoomNum()-request.getRoomNum();
	}
}
