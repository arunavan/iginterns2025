package com.insight.day1;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		System.out.println("Name"+name  +" Age:"+age);
		byte b=89; //boxing
		Byte bObj=new Byte(b);//immutable,boxing
		System.out.println(bObj.intValue()); //unBoxing
		Byte bObj2=b;//Autoboxing
		System.out.println(bObj+20);//AutoUnboxing
		System.out.println(b +"    "+bObj);
		String age1="35";
		System.out.println(Integer.parseInt(age1));
		short s=343;
		Short sObj=new Short(s);
		long l=987l;
		float f=34.23f;
		double d=234234.4123123;
		char op='+';
		Character cObj=new Character(op);
		boolean result=true;
	}
}
