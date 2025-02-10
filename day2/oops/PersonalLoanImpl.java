package com.insight.day2.oops;



public class PersonalLoanImpl implements Loan,Customer {
	public  void apply(String name) {
	System.out.println(name+" Loan is applied");	
	}
	
	public  void reject(String name) {
		System.out.println(name+" Loan is rejected ");	
		}
		
	public int getCustomerId() {
		return 89;
	}

}
