package Tests;

import java.time.LocalDate;

import Schedule.Semesters;

public class Semesters_Tester {
	private static Semesters semesters = new Semesters();
	
	public static void main(String[] args) {
		System.out.println(semesters.toString());
		
		semesters.setFallSemesterDates(semesters.getFallSemester()[0], LocalDate.of(2017,12,20));
		System.out.println("===================================");
		System.out.println(semesters.toString());
	}
}
