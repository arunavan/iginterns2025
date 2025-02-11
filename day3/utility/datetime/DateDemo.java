package com.insight.day3.utility.datetime;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		//not threadsafe
		// start 
		//zones 
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getDay());

	}

}
