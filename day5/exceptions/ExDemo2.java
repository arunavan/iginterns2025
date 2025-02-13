package com.insight.day5.exceptions;

public class ExDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int c;
		int x[]= {4,5,6};
		try {
			try {
			System.out.println(x[4]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
				
			c = a / b; //unchecked , run time
				System.out.println("result:"+c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("Thank you");
	
	}

}
