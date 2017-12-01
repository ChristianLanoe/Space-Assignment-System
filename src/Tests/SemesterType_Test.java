package Tests;

import Schedule.SemesterType;

public class SemesterType_Test {
	public static void main(String[] args) {
		SemesterType test = SemesterType.WINTER;
		int value = test.getValue();
		System.out.println(value);
	}
}
