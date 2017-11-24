package UI;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Calendar;

import javax.swing.JPanel;

import Room.Room;
import Schedule.DayOfWeekTimeSpan;
import Schedule.RoomSchedule;
import Schedule.TimeSpan;

public class RoomScheduleCreationPanel {

	JPanel panel;
	Calendar cal;
	Room a = new Room(4060,50,34,40);
	
	public RoomScheduleCreationPanel(){
		panel = new JPanel();
		
	}
	
	public void MakeSchedule(LocalTime start, LocalTime end, DayOfWeek day){
		TimeSpan ts = new TimeSpan(start, end);
		DayOfWeekTimeSpan dow = new DayOfWeekTimeSpan(day, ts);
		RoomSchedule schedule = new RoomSchedule(a);
		schedule.addBookableTime(dow);
	}
}
