package com.insight.day4.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class Student // implements Comparable
{
	Integer age;
	String name;

	public Student(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	/*
	 * public int compareTo(Object o) { Student s=(Student)o; return
	 * s.name.compareTo(this.name);
	 * 
	 * if(this.age > s.age) return 1; else if(this.age<s.age) { return -1; } else
	 * return 0;
	 * 
	 * }
	 */

}


class AgeComparator implements Comparator{
	public int compare(Object o1,Object o2) 
	{ Student s1=(Student)o1; 
	   Student s2=(Student) o2;
	   if(s1.age>s2.age)
		   return 1;
	   else if(s1.age<s2.age)
		   return -1;
	   else
		   return 0;
	}
}
class NameComparator implements Comparator{
	public int compare(Object o1,Object o2) 
	{ Student s1=(Student)o1; 
	   Student s2=(Student) o2;
	   return s1.name.compareTo(s2.name);
	}
			  
}

public class ComparableDemo {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(32, 14, 25, 76, 27, 38, 19);
		l.forEach(x -> System.out.print(" " + x));
		Collections.sort(l);
		System.out.println();
		l.forEach(x -> System.out.print(" " + x));

		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student(19, "bindu"));
		studentList.add(new Student(15, "poojitha"));
		studentList.add(new Student(16, "akanksha"));
		studentList.add(new Student(12, "manideep"));
		studentList.add(new Student(18, "janakiram"));
		studentList.add(new Student(11, "harsha"));
		studentList.forEach(x -> System.out.println(x));

		Collections.sort(studentList,new NameComparator());
		System.out.println();
		studentList.forEach(x -> System.out.println(x));
		
		TreeSet<Student> stuSet=new TreeSet<>(new NameComparator());
		stuSet.add(new Student(19, "bindu"));
		stuSet.add(new Student(15, "poojitha"));
		stuSet.add(new Student(16, "akanksha"));
		stuSet.add(new Student(12, "manideep"));
		stuSet.add(new Student(18, "janakiram"));
		stuSet.add(new Student(11, "harsha"));
		stuSet.forEach(x -> System.out.println(x));
		
		

	}

}
