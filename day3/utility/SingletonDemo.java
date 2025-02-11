package com.insight.day3.utility;


//custom singleton 
class Singleton1{
	public static Singleton1 s=null;
	private Singleton1(){
	}
	public static Singleton1 getInstance() {
		if(s==null) {
			s=new Singleton1(); }
		return s;
	}
}
public class SingletonDemo {
	public static void main(String[] args) {
		Singleton1 s1=Singleton1.getInstance(); //new Singleton1();
		Singleton1 s2= Singleton1.getInstance();   //new Singleton1();
		System.out.println(s1  + "   "+s2 );
		System.out.println(s1.hashCode()+  "   "+s2.hashCode());
	}
}
