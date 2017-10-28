package Request;

import Room.Room;
import Utils.Contact;
import java.util.Calendar;
public class Request extends Contact{
	private Room room;
	private Calendar startTime;
	private Calendar endTime;
	private String description;
	
	public Request(String FName, String LName,long phoneNumber, String eMail, Room room, Calendar startTime, Calendar endTime, String description) {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
