
package com.capgemini.lesson5.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author vs823751
 * This program demonstrate on how to convert the string value into date and time
 * 
 */
public class ParsingDate {

	public static void main(String[] args) {
		/*	DateTimeFormatter is used to configure the date time format
			DateTimeFormatter can also be obtained by using ofPattern() 
			which you can use for custom date and time format
		 */
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter date in dd/MM/yyyy format:");
		String input  = scanner.nextLine();
		
		//Almost every class in java.time package provides parse() method to parse the date or time
		LocalDate enteredDate = LocalDate.parse(input,formatter);

		System.out.println("Entered Date:"+ enteredDate);
		scanner.close();
		
	}
}
