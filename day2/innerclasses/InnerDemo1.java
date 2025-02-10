package com.insight.day2.innerclasses;
public class InnerDemo1 {
	int y;
	class Inner {//member inner class-type 1
		int x;
		void imethod() {
			
		}
	}
	void omethod() {
	}
	public static void main(String[] args) {
		InnerDemo1 i=new InnerDemo1();
		i.omethod();
		InnerDemo1.Inner ii=new InnerDemo1().new Inner();
		ii.imethod();

	}
}
