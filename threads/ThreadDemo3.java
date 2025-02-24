package com.insight.threads;
public class ThreadDemo3  extends Thread{
  	 public void run() {
  		 for(int i=0;i<=5;i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			 }
	public static void main(String[] args) {
		ThreadDemo3 t1=new ThreadDemo3();
		t1.start(); //run
		t1.setName("Java1");
		for(int i=0;i<=5;i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.activeCount());
		
		
	}
}
