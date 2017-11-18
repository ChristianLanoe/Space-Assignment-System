package Tests;

import java.time.LocalDateTime;
import Schedule.DateTime_TimeSpan;
public class DTTS_Tester {
	private static int ZERO = 0;
	
	public static void main(String[] args) {
		
		LocalDateTime startDT = LocalDateTime.now().withMinute(ZERO).withSecond(ZERO).withNano(ZERO);
		LocalDateTime endDT = startDT.plusHours(2);
		
				
		DateTime_TimeSpan dtts = new DateTime_TimeSpan(startDT,endDT);
		System.out.println(dtts.toString());
	}
}
