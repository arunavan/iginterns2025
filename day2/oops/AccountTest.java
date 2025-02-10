package com.insight.day2.oops;

public class AccountTest {

	public static void main(String[] args) {
		/*Account account=new Account();//JVM
		System.out.println(account);
		
		Account account2=new Account(123,"Ram","ICICI",4500.00);//JVM
		System.out.println(account2);
		
		Account account3=new Account(124,"Raj","KOTAK",5500.00);//JVM
		System.out.println(account3);
		
		Account account4=new Account(125,"HDFC",5500.00);//JVM
		System.out.println(account4);
		System.out.println(account4.getBalance());
		account4.deposit(2000.00);
		System.out.println(account4.getBalance());
		account4.withdraw(3000.00);
		System.out.println(account4.getBalance());
		*/
		SavingAccount sa=new SavingAccount();
		sa.disp();
		System.out.println(sa.bankName  +"  "+sa.email  +"  "+ sa.name);
		System.out.println(sa.getBalance());
		
		}
}
