package com.insight;
public class InitializerDemo {
	static String city="Hyderabad"; //class, static 
	String name;  //with object, instance
	{System.out.println(" instance block1");
	//InitializerDemo i33 =new InitializerDemo();
	 //System.out.println(i33.disp());
	 //System.out.println(i33.main());
	sdisp();
	}
	static void sdisp() {
		System.out.println(" static method");
	}
	public InitializerDemo(String name) {
		System.out.println(" in parameterised constructor");
		this.name = name;
	}
	InitializerDemo(){
		System.out.println("in no args costructor");
		name="xxxxx";	}
	static {
		sdisp();
		System.out.println("first static block");
	}
	{System.out.println(" instance block2");
	}
	public int main() {
		return 1;
	}
	public int disp() {
		return 2;
	}
	static {
		System.out.println("second static block");
	}
	{System.out.println(" instance block3");
	}
	public static void main(String[] args) {
		System.out.println("  main starts");
		InitializerDemo i3 =new InitializerDemo();
		InitializerDemo i4 =new InitializerDemo();
		InitializerDemo i =new InitializerDemo("User2025");
		System.out.println(i.disp());
		System.out.println(i.main());
		System.out.println(i.disp());
		System.out.println(i.main());
		System.out.println(i.disp());
		System.out.println(i.main());
		System.out.println(city);
		System.out.println(i.name);
		InitializerDemo i2 =new InitializerDemo("User2026");
		System.out.println(i2.name);
		System.out.println(i.city);
		city="Chennai";
		System.out.println(city +"  "+i.city);
		System.out.println(i2.city);
		System.out.println(i.hashCode()+   "    "+i2.hashCode());
		
	}
}
