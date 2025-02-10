package com.insight.day2.innerclasses;

public class InnerDemo3 {
   static class Inner{  // type 3- static inner class
	
	   static void show() {
		   System.out.println("static inner class- static method");
	   }
   }
	
	public static void main(String[] args) {
		
		InnerDemo3.Inner.show();

	}

}
