package com.insight.day4.collections.task;

public class AccountTest {
	public static void main(String[] args) {
		
		Account a=new Account(123,"IGUSer123",10000.00);
		AccountService service=new AccountService();
		service.addAccount(a);
		
		
		service.listAccounts();
	}

}
