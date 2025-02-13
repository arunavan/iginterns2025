package com.insight.day5.exceptions;

import java.io.FileReader;
import java.io.IOException;

//jdk7  try- with resource
public class ExDemo5 {

	public static void main(String[] args) {
		//FileReader f=null;
		try(FileReader f=new FileReader("c:\\abc.txt")) { //auto closeable
			//f=new FileReader("c:\\abc.txt");//file
					
			//...read or write
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		/*
		finally {
			try {
			f.close();
			}
			catch(IOException e1) {
				e1.printStackTrace();
			}
		}
		
		*/
		
		//try - multi catch 
		try {
			
		}
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException   e1) {
			
		}
		//catch(Exception e) {}
		/*
		 * catch(ArrayIndexOutOfBoundsException e2) {
		 * 
		 * }
		 */

	}

}
