package com.capgemini.lesson5.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * This program will demonstrate on how to calculate difference between two dates
 */

public class CalculatingPeriod {

	public static void main(String[] args) {
		
		LocalDate start = LocalDate.of(1947,Month.AUGUST,15);
		LocalDate end = LocalDate.now();
		
		Period period = start.until(end);
		
		System.out.println("Days:"+ period.getDays());
		System.out.println("Months:"+period.getMonths());
		System.out.println("Years:"+ period.getYears());
	}
}
