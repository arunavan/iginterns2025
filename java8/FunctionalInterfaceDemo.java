package com.insight.java8;

//one single abstract method
//FunctionalInterface
@FunctionalInterface //optional
interface Calculator {
	int op(int a,int b);
	//int product(int a,int b);
	static void disp() {
	}
	default void show() {
		
	}
}

//impl, override 
public class FunctionalInterfaceDemo  
{
	
	
	public static void main(String[] args) {
     //  Calculator c=new FunctionalInterfaceDemo();
     //  System.out.println(c.op(6, 8));

		
		
		 Calculator c=  (int a,int b)-> {  return a+b;  };  
		 System.out.println(c.op(4,5));
		 
		 Calculator c1=  (a,b)->a-b;  
		 System.out.println(c1.op(124,5));
		 
		
	}

}

