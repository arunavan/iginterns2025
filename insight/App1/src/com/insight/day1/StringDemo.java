package com.insight.day1;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringDemo {
	public static void main(String[] args) {
		//immutable
		//String course="java";
		/*
		String course1=new String("java");//2
		String course="java";
		System.out.println(course.toUpperCase());
		System.out.println(course);
		System.out.println(course.length());
		System.out.println(course.concat("technology"));
		System.out.println("language".length());
		System.out.println(course.contains("a"));
		System.out.println(course.indexOf("a"));
		System.out.println(course.charAt(2));
		System.out.println(course.intern());
		//mutable,slow,synchronized
		StringBuffer sb=new StringBuffer(course1);
		System.out.println(sb.append(" language"));
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.insert(2, "xxxx"));
		sb.delete(2, 6);
		System.out.println(sb);
		System.out.println(sb.reverse());
		//mutable, fast,not syncronized
		StringBuilder sb1=new StringBuilder(course1);
		System.out.println(sb1.append(" language"));
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb1.insert(2, "xxxx"));
		sb1.delete(2, 6);
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		String ss1=sb.toString();
		String ss2=sb1.toString();
	    ss1=null;
	    System.gc();
	    */
	    String line="InsightGlobalUSer, Hyderabad,Telangana,India";
	    System.out.println(line.matches("[A-Z][[a-z]*"));  //regex
		/*
		 * String tokens[]=line.split(","); for( String t:tokens) System.out.println(t);
		 */ 
		StringTokenizer st=new StringTokenizer(line,",");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		StringJoiner sj=new StringJoiner("-");
		sj.add("user234");
		sj.add("Chennai");
		sj.add("Tamilnadu");
		System.out.println(sj.toString());
		
	}
}
