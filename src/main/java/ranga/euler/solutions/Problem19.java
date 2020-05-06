package ranga.euler.solutions;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Problem19 {

	public static void main(String[] args) {
		System.out.println(countingSundays(1943, 1946));
	}
	
	public static int countingSundays(int startYear, int endYear) {
		
		int count = 0;
		
		for (int year = startYear; year<= endYear; year++) {
			for (int month = 1; month<=12; month++) {
				LocalDate dt = LocalDate.of(year, month, 1);
				if ( dt.getDayOfWeek() == DayOfWeek.SUNDAY ) { 
					count++;
				}
			}
		}
		
		return count;
	}

}
