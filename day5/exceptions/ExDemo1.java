package com.insight.day5.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExDemo1 {

	public static void main(String[] args)  throws InterruptedException,FileNotFoundException{
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int c = a / b; //unchecked , run time
		//Thread.sleep(500);//checked
		//FileReader f=new FileReader("c:\\abc.txt");//checked, compiletime
		System.out.println("result:"+c);
		System.out.println("Thank you");
	}

}
