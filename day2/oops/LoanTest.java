package com.insight.day2.oops;

public class LoanTest {

	public static void main(String[] args) {
		/*
		Loan l;
		PersonalLoanImpl pl=new PersonalLoanImpl();    //=new Loan();
		l=pl;
		
		Loan l1=new PersonalLoanImpl();
		l1=new PersonalLoanImpl();
		*/
		
		Loan l=new PersonalLoanImpl();
		l.apply(null);
		l.apply(null);
		Customer c=new PersonalLoanImpl();
		c.getCustomerId();
		
		l=new HousingLoanImpl();
		l.apply(null);
		l.reject(null);
		
	}

}
