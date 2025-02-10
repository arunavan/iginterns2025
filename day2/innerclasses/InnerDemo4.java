package com.insight.day2.innerclasses;

public class InnerDemo4 {
	
	void taste() {
		System.out.println("sweet");
	}

	public static void main(String[] args) {
		
		InnerDemo4 i=new InnerDemo4();
		i.taste();
		
		InnerDemo4 i1=new InnerDemo4() {
			               void taste() {
			            	   System.out.println("spicy");
			               }
		                };
		   i1.taste();

	}

}
