package Request;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Room.Room;
import Utils.Contact;

public class Request extends Contact{
	private Room room;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private String description;
	private String id;
	
	public Request(String FName, String LName,long phoneNumber, String eMail, Room room, LocalDateTime startTime, LocalDateTime endTime, String description) {
		super(FName, LName, phoneNumber, eMail);
		this.room = room;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE MMMM dd,YYYY hh:mm a");
		sb.append("REQUEST\n");
		sb.append("-----------------------\n");
		sb.append("Room " + room.getRoomNumber());
		sb.append("\n");
		sb.append("Start Time: " + dtf.format(startTime));
		sb.append("\n");
		sb.append("End Time: " + dtf.format(endTime));
		
		
		return sb.toString();
	}
}
