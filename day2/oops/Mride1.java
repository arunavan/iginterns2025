package com.insight.day2.oops;

public class Mride1 extends Mride{
	final int x=90;
	@Override
	void sq(int s) {
		System.out.println(s*s*s);
	}
	public static void main(String[] args) {
		Ride r=new Ride();
		r.sq(3);
		r=new Mride();
		r.sq(3);
		Mride1 r1=new Mride1();
		r1.sq(3);
		System.out.println(r1.x);
		
	}

}
