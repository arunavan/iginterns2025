package com.insight.threads;


class Caller {
	
	public  synchronized  void call(String s) {
		//synchronized(this) {
		try {
			System.out.print("[ welcome  MR/Miss:" );
			Thread.sleep(1000);
			System.out.print(s);
			System.out.println(" , Good Morning ! ]");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//}
		
		
	}
	
	
}

public class SyncDemo extends Thread {
   Caller c;
   String s;
	SyncDemo(Caller c, String s){
		
		this.c=c;
		this.s=s;
		this.start();
	}
	public void run() {
		c.call(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caller c=new Caller();
	   SyncDemo s1=new SyncDemo(c,"USer1");
	   SyncDemo s2=new SyncDemo(c,"USer2");
	   SyncDemo s3=new SyncDemo(c,"USer3");
	   

	}

}
