package com.insight.day2.oops;

//IS a -
public class SavingAccount extends Account{
	
	String email;
	public SavingAccount(){
		super();
		System.out.println(" in child");
	}
	public void disp() {
		System.out.println(name  + bankName);
		System.out.println("child class- disp");
	}
	

}
