package com.insight.conucrrency;
public class SharedObject implements Runnable{
	private static StringBuilder message=new StringBuilder("Welcome");
@Override
		public void run() {
	int size=message.length();
	synchronized(this){
		for(int i=0;i<size;i++){
			System.out.println(message.append('x'));
		}
	}
	}
}
