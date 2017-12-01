package Tests;

import java.time.DayOfWeek;
import java.time.LocalTime;

import Request.Request;
import Room.Room;
import Schedule.DayOfWeekTimeSpan;
import Schedule.TimeSpan;

public class RequestTester {
	public static void main(String[] args) {
		int roomNumber = 3001;
		String roomName = "Board Room";
		int capacity = 50;
		int length = 45;
		int width = 55;

		Room room = new Room(roomNumber, roomName, capacity, length, width);

		LocalTime startTime = LocalTime.now().withMinute(0).minusHours(1);
		LocalTime endTime = startTime.plusHours(4);

		LocalTime s1 = startTime.plusHours(1);
		LocalTime e1 = endTime.plusHours(1);

		String desc = "book this room NOW please :)";

		long phoneNumber = 17097463956L;

		TimeSpan span = new TimeSpan(startTime, endTime);
		DayOfWeekTimeSpan[] spans = new DayOfWeekTimeSpan[5];

		spans[0] = new DayOfWeekTimeSpan(DayOfWeek.MONDAY, span);
		spans[1] = new DayOfWeekTimeSpan(DayOfWeek.WEDNESDAY, new TimeSpan(s1, e1));
		spans[2] = new DayOfWeekTimeSpan(DayOfWeek.TUESDAY, new TimeSpan(s1, e1));
		spans[3] = new DayOfWeekTimeSpan(DayOfWeek.THURSDAY, span);
		spans[4] = new DayOfWeekTimeSpan(DayOfWeek.FRIDAY, new TimeSpan(s1, e1));

		Request req = new Request("Eric", "Elli", phoneNumber, "eric_elli_91@hotmail.com", roomNumber, desc, spans);
		System.out.println(req.toString());
	}
}
