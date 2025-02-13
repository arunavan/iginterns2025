package com.insight.day5.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class ExDemo3 {

	public  void disp() throws  InterruptedException,FileNotFoundException {
		Thread.sleep(500);//checked
		FileReader f=new FileReader("c:\\abc.txt");//checked, compiletime
				
	}
	public static void main(String[] args) throws  InterruptedException,FileNotFoundException{
	ExDemo3 ex=new ExDemo3();
		  ex.disp();
		
	}

}
