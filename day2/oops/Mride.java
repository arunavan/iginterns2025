package com.insight.day2.oops;

public class Mride  extends Ride{
	@Override
	void sq(int s){
		System.out.println(" PErimeter:"+(4*s));
		super.disp();
		this.disp();
	}

	void disp() {
		System.out.println(" parent method");
	}
	public static void main(String[] args) {
		 Ride m=new Ride();
		 m.sq(5);
		 m=new Mride();
		 m.sq(5);
	}

}
