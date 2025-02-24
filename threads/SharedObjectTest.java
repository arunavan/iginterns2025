package com.insight.conucrrency;

public class SharedObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedObject  so1=new SharedObject(); 
		Thread t1=new Thread(so1);
		t1.start();
		
		Thread t2=new Thread(new SharedObject());
		t2.start();
	}

}
