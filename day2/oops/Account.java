package com.insight.day2.oops;
public class Account { //   public , protected , default , private 
	Integer AcNumber; 
	public String name;
	protected String bankName;
	private Double balance;
	 public Account(){ //no arg constructor
		 super();
		 System.out.println(" parent");
		 name="IGUSer1";
	  
	  }
	 public Account(Integer acNumber, String bankName, Double balance) {
	    this();
	  //  super();
		AcNumber = acNumber;
		this.bankName = bankName;
		this.balance = balance;
	}
	public Account(Integer acNumber, String name, String bankName) {
		super();
		AcNumber = acNumber;
		this.name = name;
		this.bankName = bankName;
	}
	//intilization
	public Account(Integer acNumber, String name, String bankName, Double balance) {
		this.AcNumber = acNumber;
		this.name = name;
		this.bankName = bankName;
		this.balance = balance;
		
	}



	@Override
	public String toString() {
		return "Account [AcNumber=" + AcNumber + ", name=" + name + ", bankName=" + bankName + ", balance=" + balance
				+ "]";
	}


//bL
	Double getBalance() {
		return balance;
	}
	void withdraw(Double amount){//local, method argument
		balance-=amount;
	}
	void deposit(Double amount) {
		balance+=amount;
		
	}
	

}
