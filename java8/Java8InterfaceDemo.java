package com.insight.java8;


interface Arith{
	
	int add(int a,int b);
	default int product(int a,int b) { return a*b;}
	
	int div(int a,int b);
	
	static void show() {
		System.out.println(" java8 static method");
	}
	default void disp() {
		System.out.println(" parent default");
	}
}

interface Calc {
	default void disp() {
		System.out.println(" Calc default");
	}
}
public class Java8InterfaceDemo implements Arith,Calc{
	@Override
	public int add(int a,int b) {
		return a+b;
	}
	
	public int div(int a,int b) {
		return a/b;
	}
	@Override
	public void disp() {
		System.out.println(" child default");
	}
	void show() {
		System.out.println(" class show");
	}
	
	void dispParent() {
		Arith.super.disp();
		Calc.super.disp();
	}

	public static void main(String[] args) {
		Arith a=new Java8InterfaceDemo();
		System.out.println(a.add(6, 4));
		a.disp();
		Arith.show();
		Java8InterfaceDemo a1=new Java8InterfaceDemo();
		a1.show();
		a1.disp();
		a1.dispParent();
		
		
	}

}
