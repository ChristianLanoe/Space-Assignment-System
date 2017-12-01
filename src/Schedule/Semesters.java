package Schedule;

import java.io.Serializable;
import java.time.LocalDate;

/*
 * Class to define the semesters and their start and end times
 */
public class Semesters implements Serializable {
	private LocalDate[] Fall = { LocalDate.of(2017, 9, 7), LocalDate.of(2017, 12, 16) };
	private LocalDate[] Winter = { LocalDate.of(2018, 01, 5), LocalDate.of(2018, 04, 20) };
	private LocalDate[] Summer = { LocalDate.of(2018, 05, 8), LocalDate.of(2018, 06, 21) };
	private LocalDate[][] All_Semesters = new LocalDate[3][2];

	public Semesters() {
		All_Semesters[0] = Fall;
		All_Semesters[1] = Winter;
		All_Semesters[2] = Summer;
	}

	public LocalDate[][] getAllSemesters() {
		return All_Semesters;
	}

	public LocalDate[] getFallSemester() {
		return Fall;
	}

	public LocalDate[] getWinterSemester() {
		return Winter;
	}

	public LocalDate[] getSummerSemester() {
		return Summer;
	}

	public LocalDate[] getSemester(SemesterType semester) {
		if (semester.equals(SemesterType.FALL)) {
			return Fall;
		} else if (semester.equals(SemesterType.WINTER)) {
			return Winter;
		} else if (semester.equals(SemesterType.SUMMER)) {
			return Summer;
		}
		return null;
	}

	public SemesterType getSemesterType(LocalDate date) {
		if ((date.isAfter(Fall[0]) || date.isEqual(Fall[0])) && (date.isAfter(Fall[1]) || date.isEqual(Fall[1]))) {
			return SemesterType.FALL;
		} else if ((date.isAfter(Winter[0]) || date.isEqual(Winter[0]))
				&& (date.isAfter(Winter[1]) || date.isEqual(Winter[1]))) {
			return SemesterType.WINTER;
		} else if ((date.isAfter(Summer[0]) || date.isEqual(Summer[0]))
				&& (date.isAfter(Summer[1]) || date.isEqual(Summer[1]))) {
			return SemesterType.SUMMER;
		}
		return null;
	}

	public void setFallSemesterDates(LocalDate start, LocalDate end) {
		Fall[0] = start;
		Fall[1] = end;
	}

	public void setWinterSemesterDates(LocalDate start, LocalDate end) {
		Winter[0] = start;
		Winter[1] = end;
	}

	public void setSummerSemesterDates(LocalDate start, LocalDate end) {
		Summer[0] = start;
		Summer[1] = end;
	}

	public void setSemesterDates(SemesterType semester, LocalDate start, LocalDate end) {
		if (semester.equals(SemesterType.FALL)) {
			setFallSemesterDates(start, end);
		} else if (semester.equals(SemesterType.WINTER)) {
			setWinterSemesterDates(start, end);
		} else if (semester.equals(SemesterType.SUMMER)) {
			setSummerSemesterDates(start, end);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < All_Semesters.length; i++) {
			for (int j = 0; j < All_Semesters[i].length; j++) {
				sb.append(All_Semesters[i][j].toString());
				sb.append("\n");
			}
		}
		return sb.toString();
	}
}
