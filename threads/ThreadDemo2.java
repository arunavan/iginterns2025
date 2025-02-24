package com.insight.threads;

public class ThreadDemo2 implements Runnable {  //run
	 public void run() {
		 System.out.println(Thread.currentThread().getName());
	 }
	
	
	public static void main(String[] args) {
		ThreadDemo2 t2=new ThreadDemo2();
		Thread t=new Thread(t2);
		t.start();
		System.out.println(Thread.activeCount());
		
	}

}
