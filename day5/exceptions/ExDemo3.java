package com.insight.day5.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

class X{
	public void disp() throws  InterruptedException,FileNotFoundException{
		Thread.sleep(500);//checked
		FileReader f=new FileReader("c:\\abc.txt");//checked, compiletime
		
	}
}
public class ExDemo3 extends X {
    @Override
	public  void disp() throws  InterruptedException ,FileNotFoundException 
    {
		Thread.sleep(500);//checked
		FileReader f=new FileReader("c:\\abc.txt");//checked, compiletime
		int x[]= {5,6,7};
		System.out.println(x[7]);
				
	}
	public static void main(String[] args) throws  InterruptedException,FileNotFoundException{
	ExDemo3 ex=new ExDemo3();
		  ex.disp();
		
	}

}
