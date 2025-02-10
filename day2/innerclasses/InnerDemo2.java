package com.insight.day2.innerclasses;
import com.insight.day2.innerclasses.InnerDemo1.Inner;
public class InnerDemo2 {
	int y;
	void omethod() {
		class Inner {//local inner  class-type 2
			int x;
			void imethod() {
				System.out.println(x+"  "+ y);
			}
		}
		Inner i=new Inner();
		System.out.println(i.x);
		i.imethod();
		System.out.println(y+" ");
	}
	public static void main(String[] args) {
		InnerDemo2 i=new InnerDemo2();
		i.omethod();
	}
}
