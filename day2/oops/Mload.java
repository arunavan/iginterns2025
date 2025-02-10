package com.insight.day2.oops;

// static , within a class, methods name is same but not signature

public class Mload {
	void area(int s) {
		System.out.println("sq:"+(s*s));
	}
	void area(int l,int b) {
		System.out.println("rest:"+(l*b));
	}
	void area(double r) {
		System.out.println("circle:"+(3.142*r*r));
	}
	public static void main(String[] args) {
		Mload m=new Mload();
		m.area(4);
		m.area(5.6);
		m.area(8);
	}

}
