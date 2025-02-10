package com.insight.day2.oops;

public class HousingLoanImpl implements Loan,Customer {
		public  void apply(String name) {
		System.out.println(name+" Housing Loan is applied");	
		}
		
		public  void reject(String name) {
			System.out.println(name+" Hoising Loan is rejected ");	
			}
			
		public int getCustomerId() {
			return 89;
		}

	}
