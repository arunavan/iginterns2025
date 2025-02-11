package com.insight.day3.utility.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;


public class LocalDateExample {

	public static void main(String[] args) {
		
		//Current Date
		LocalDate today = LocalDate.now();
		LocalDate.
		System.out.println("Current Date="+today);
		
		//Creating LocalDate by providing input arguments
		LocalDate firstDay_2014 = LocalDate.of(22025, Month.JANUARY, 1);
		System.out.println("Specific Date="+firstDay_2014);
		
		
		//Try creating date by providing invalid inputs
		//LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
		//Exception in thread "main" java.time.DateTimeException: 
		//Invalid date 'February 29' as '2014' is not a leap year
		
		//Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST="+todayKolkata);

		
	}

}