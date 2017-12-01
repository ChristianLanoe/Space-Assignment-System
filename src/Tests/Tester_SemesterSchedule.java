package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalTime;

import Schedule.DayOfWeekTimeSpan;
import Schedule.Full_Calendar;
import Schedule.Full_RoomSchedule;
import Schedule.SemesterType;
import Schedule.Semester_RoomSchedule;
import Schedule.TimeSpan;

public class Tester_SemesterSchedule implements Serializable {
	private static Full_Calendar fullCalendar;

	public static void main(String[] args) {
		int MINUTE = 0;

		// Creating full Gym schedule
		Semester_RoomSchedule gymSummer = new Semester_RoomSchedule("Gym", SemesterType.SUMMER);
		Semester_RoomSchedule gymWinter = new Semester_RoomSchedule("Gym", SemesterType.WINTER);
		Semester_RoomSchedule gymFall = new Semester_RoomSchedule("Gym", SemesterType.FALL);

		LocalTime a_startTime = LocalTime.of(6, MINUTE);
		LocalTime a_endTime = LocalTime.of(23, MINUTE);
		TimeSpan a_ts = new TimeSpan(a_startTime, a_endTime);
		TimeSpan test = new TimeSpan(LocalTime.of(9, MINUTE), LocalTime.of(12, MINUTE));
		DayOfWeekTimeSpan a_M = new DayOfWeekTimeSpan(DayOfWeek.MONDAY, a_ts);
		DayOfWeekTimeSpan a_M1 = new DayOfWeekTimeSpan(DayOfWeek.MONDAY, test);
		DayOfWeekTimeSpan a_T = new DayOfWeekTimeSpan(DayOfWeek.TUESDAY, a_ts);
		DayOfWeekTimeSpan a_W = new DayOfWeekTimeSpan(DayOfWeek.WEDNESDAY, a_ts);
		DayOfWeekTimeSpan a_R = new DayOfWeekTimeSpan(DayOfWeek.THURSDAY, a_ts);
		DayOfWeekTimeSpan a_F = new DayOfWeekTimeSpan(DayOfWeek.FRIDAY, a_ts);
		DayOfWeekTimeSpan a_S = new DayOfWeekTimeSpan(DayOfWeek.SATURDAY, a_ts);
		DayOfWeekTimeSpan a_Su = new DayOfWeekTimeSpan(DayOfWeek.SUNDAY, a_ts);

		gymWinter.addRoomSchedule(a_M1);
		gymWinter.addRoomSchedule(a_W);
		gymWinter.addRoomSchedule(a_Su);
		gymWinter.addRoomSchedule(a_R);
		gymWinter.addRoomSchedule(a_S);
		gymWinter.addRoomSchedule(a_F);
		gymWinter.addRoomSchedule(a_T);

		gymSummer.addRoomSchedule(a_M);
		gymSummer.addRoomSchedule(a_W);
		gymSummer.addRoomSchedule(a_Su);
		gymSummer.addRoomSchedule(a_S);
		gymSummer.addRoomSchedule(a_F);
		gymSummer.addRoomSchedule(a_T);
		gymSummer.addRoomSchedule(a_R);

		gymFall.addRoomSchedule(a_M1);
		gymFall.addRoomSchedule(a_W);
		gymFall.addRoomSchedule(a_Su);
		gymFall.addRoomSchedule(a_S);
		gymFall.addRoomSchedule(a_F);
		gymFall.addRoomSchedule(a_R);
		gymFall.addRoomSchedule(a_T);

		Full_RoomSchedule gymFull = new Full_RoomSchedule("Gym");
		gymFull.addSemesterSchedules(gymWinter);
		gymFull.addSemesterSchedules(gymSummer);
		gymFull.addSemesterSchedules(gymFall);

		// Creating full Cafeteria schedule
		Semester_RoomSchedule cafeteriaSummer = new Semester_RoomSchedule("Cafeteria", SemesterType.SUMMER);
		Semester_RoomSchedule cafeteriaWinter = new Semester_RoomSchedule("Cafeteria", SemesterType.WINTER);
		Semester_RoomSchedule cafeteriaFall = new Semester_RoomSchedule("Cafeteria", SemesterType.FALL);

		TimeSpan morning = new TimeSpan(LocalTime.of(9, MINUTE), LocalTime.of(12, MINUTE));
		TimeSpan afternoon = new TimeSpan(LocalTime.of(13, MINUTE), LocalTime.of(18, MINUTE));
		TimeSpan weekend = new TimeSpan(LocalTime.of(6, MINUTE), LocalTime.of(20, MINUTE));

		DayOfWeekTimeSpan cafM = new DayOfWeekTimeSpan(DayOfWeek.MONDAY, morning);
		DayOfWeekTimeSpan cafM1 = new DayOfWeekTimeSpan(DayOfWeek.MONDAY, afternoon);

		DayOfWeekTimeSpan cafT = new DayOfWeekTimeSpan(DayOfWeek.TUESDAY, morning);
		DayOfWeekTimeSpan cafT1 = new DayOfWeekTimeSpan(DayOfWeek.TUESDAY, afternoon);

		DayOfWeekTimeSpan cafW = new DayOfWeekTimeSpan(DayOfWeek.WEDNESDAY, morning);
		DayOfWeekTimeSpan cafW1 = new DayOfWeekTimeSpan(DayOfWeek.WEDNESDAY, afternoon);

		DayOfWeekTimeSpan cafR = new DayOfWeekTimeSpan(DayOfWeek.THURSDAY, morning);
		DayOfWeekTimeSpan cafR1 = new DayOfWeekTimeSpan(DayOfWeek.THURSDAY, afternoon);

		DayOfWeekTimeSpan cafF = new DayOfWeekTimeSpan(DayOfWeek.FRIDAY, morning);
		DayOfWeekTimeSpan cafF1 = new DayOfWeekTimeSpan(DayOfWeek.FRIDAY, afternoon);

		DayOfWeekTimeSpan cafS = new DayOfWeekTimeSpan(DayOfWeek.SATURDAY, weekend);
		DayOfWeekTimeSpan cafSu = new DayOfWeekTimeSpan(DayOfWeek.SUNDAY, weekend);

		cafeteriaWinter.addRoomSchedule(cafM);
		cafeteriaWinter.addRoomSchedule(cafT);
		cafeteriaWinter.addRoomSchedule(cafW);
		cafeteriaWinter.addRoomSchedule(cafR);
		cafeteriaWinter.addRoomSchedule(cafF);
		cafeteriaWinter.addRoomSchedule(cafS);
		cafeteriaWinter.addRoomSchedule(cafSu);
		cafeteriaWinter.addRoomSchedule(cafM1);
		cafeteriaWinter.addRoomSchedule(cafT1);
		cafeteriaWinter.addRoomSchedule(cafW1);
		cafeteriaWinter.addRoomSchedule(cafR1);
		cafeteriaWinter.addRoomSchedule(cafF1);

		cafeteriaSummer.addRoomSchedule(cafM);
		cafeteriaSummer.addRoomSchedule(cafW);
		cafeteriaSummer.addRoomSchedule(cafSu);
		cafeteriaSummer.addRoomSchedule(cafS);
		cafeteriaSummer.addRoomSchedule(cafF);
		cafeteriaSummer.addRoomSchedule(cafT);
		cafeteriaSummer.addRoomSchedule(cafR);
		cafeteriaSummer.addRoomSchedule(cafM1);
		cafeteriaSummer.addRoomSchedule(cafW1);
		cafeteriaSummer.addRoomSchedule(cafF1);
		cafeteriaSummer.addRoomSchedule(cafT1);
		cafeteriaSummer.addRoomSchedule(cafR1);

		cafeteriaFall.addRoomSchedule(cafM);
		cafeteriaFall.addRoomSchedule(cafW);
		cafeteriaFall.addRoomSchedule(cafSu);
		cafeteriaFall.addRoomSchedule(cafS);
		cafeteriaFall.addRoomSchedule(cafF);
		cafeteriaFall.addRoomSchedule(cafT);
		cafeteriaFall.addRoomSchedule(cafR);
		cafeteriaFall.addRoomSchedule(cafM1);
		cafeteriaFall.addRoomSchedule(cafW1);
		cafeteriaFall.addRoomSchedule(cafF1);
		cafeteriaFall.addRoomSchedule(cafT1);
		cafeteriaFall.addRoomSchedule(cafR1);

		Full_RoomSchedule cafeteriaFull = new Full_RoomSchedule("Cafeteria");

		cafeteriaFull.addSemesterSchedules(cafeteriaWinter);
		cafeteriaFull.addSemesterSchedules(cafeteriaSummer);
		cafeteriaFull.addSemesterSchedules(cafeteriaFall);

		Full_RoomSchedule boardRoom = new Full_RoomSchedule("Board Room");
		Semester_RoomSchedule boardRoomSummer = new Semester_RoomSchedule("Board Room", SemesterType.SUMMER);
		Semester_RoomSchedule boardRoomWinter = new Semester_RoomSchedule("Board Room", SemesterType.WINTER);
		Semester_RoomSchedule boardRoomFall = new Semester_RoomSchedule("Board Room", SemesterType.FALL);
		boardRoom.addSemesterSchedules(boardRoomFall);
		boardRoom.addSemesterSchedules(boardRoomWinter);
		boardRoom.addSemesterSchedules(boardRoomSummer);

		Full_RoomSchedule computerLab = new Full_RoomSchedule("Computer Lab");
		Semester_RoomSchedule computerLabSummer = new Semester_RoomSchedule("Computer Lab", SemesterType.SUMMER);
		Semester_RoomSchedule computerLabWinter = new Semester_RoomSchedule("Computer Lab", SemesterType.WINTER);
		Semester_RoomSchedule computerLabFall = new Semester_RoomSchedule("Computer Lab", SemesterType.FALL);
		computerLab.addSemesterSchedules(computerLabSummer);
		computerLab.addSemesterSchedules(computerLabWinter);
		computerLab.addSemesterSchedules(computerLabFall);

		Full_RoomSchedule library = new Full_RoomSchedule("Library");
		Semester_RoomSchedule LibrarySummer = new Semester_RoomSchedule("Library", SemesterType.SUMMER);
		Semester_RoomSchedule LibraryWinter = new Semester_RoomSchedule("Library", SemesterType.WINTER);
		Semester_RoomSchedule LibraryFall = new Semester_RoomSchedule("Library", SemesterType.FALL);
		library.addSemesterSchedules(LibraryFall);
		library.addSemesterSchedules(LibraryWinter);
		library.addSemesterSchedules(LibrarySummer);

		Full_Calendar all = new Full_Calendar();
		all.addFullSchedule(gymFull);
		all.addFullSchedule(cafeteriaFull);
		all.addFullSchedule(library);
		all.addFullSchedule(computerLab);
		all.addFullSchedule(boardRoom);

		// System.out.println("Printing Full_Calendar");
		// System.out.println("=================================");
		// System.out.println(all.toString());
		//
		// //Testing Full_RoomSchedule forSemester function
		// System.out.println("Printing Gym Full_RoomSchedule forSemester(Winter)");
		// System.out.println("=================================");
		// Semester_RoomSchedule blah = gymFull.forSemester(SemesterType.WINTER);
		// System.out.println(blah.getSemesterType());
		// System.out.println(blah.toString());
		//
		// //Testing Full_Calendar forSemester function
		// System.out.println("Printing Full_Calendar forSemester(Cafeteria,Fall)");
		// System.out.println("=================================");
		// Semester_RoomSchedule hello = all.forSemester("Cafeteria",
		// SemesterType.FALL);
		// System.out.println(hello.toString());
		//
		// //Testing Semester_RoomSchedule getAvailable(DayOfWeek)
		// System.out.println("Printing Semester_Schedule getAvailable(Monday)");
		// System.out.println("=================================");
		// Boolean[] world = cafeteriaFall.availableTimes(DayOfWeek.MONDAY);
		// Boolean[] world1 = cafeteriaFall.availableTimes(DayOfWeek.TUESDAY);
		// System.out.println(Arrays.toString(world));
		// System.out.println(Arrays.toString(world1));
		//
		// //Testing Full_RoomShedule getAvailable(DayOfWeek, SemesterType)
		// System.out.println("Printing Full_RoomSchedule
		// getAvailable(Tuesday,WINTER)");
		// System.out.println("=================================");
		// Boolean[] blank = gymFull.getAvailable(DayOfWeek.MONDAY,SemesterType.WINTER);
		// System.out.println(Arrays.toString(blank));
		//
		// System.out.println("TEST");
		// Boolean[][] array = all.getAvailableTimes("Gym", SemesterType.SUMMER);
		// System.out.println(Arrays.deepToString(array));

		all.serialize();
		initializeCalendar();

		// System.out.println("Printing Deserialized Calendar");
		// System.out.println(fullCalendar.toString());
		// System.out.println(fullCalendar.forSemester("Cafeteria",
		// SemesterType.SUMMER));
		// System.out.println(fullCalendar.forSemester("Gym", SemesterType.WINTER));
		// System.out.println(Arrays.deepToString(all.getAvailableTimes("Gym",
		// SemesterType.WINTER)));
		// System.out.println(Arrays.deepToString(fullCalendar.getAvailableTimes("Gym",
		// SemesterType.WINTER)));
		// System.out.println(Arrays.toString(fullCalendar.forSemester("Gym",
		// SemesterType.WINTER).availableTimes(DayOfWeek.MONDAY)));

		System.out.println("Full_Calendar initialized!");
	}

	public static void initializeCalendar() {
		try {
			FileInputStream fis = new FileInputStream("docs/fullSchedule.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			fullCalendar = (Full_Calendar) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			System.out.println("Full_Calendar not found!");
			e.printStackTrace();
			return;
		}
	}
}
