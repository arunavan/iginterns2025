package com.insight.conucrrency;

public class DeadDemo
{
	public static void main(String args[])
	{

	String s1="Dead";
	String s2="Lock";
	MyThread1 m=new MyThread1(s1,s2);
	MyThread2 m1=new MyThread2(s1,s2);
	}

}

class MyThread1 extends Thread
{
	String s1;
	String s2;
	MyThread1(String s1, String s2)
	{

	this.s1=s1;
	this.s2=s2;
	
	start();

	}

	public void run()
	{
		while(true)
		{
		

			synchronized(s2)
			{
			System.out.println(s1+s2);		
			}
		

		}

	}

}


class MyThread2 extends Thread
{
	String s1;
	String s2;
	MyThread2(String s1,String s2)
	{

	this.s1=s1;
	this.s2=s2;
	
	start();

	}

	public void run()
	{
		while(true)
		{
		
		
			synchronized(s1)
			{
			System.out.println(s2+s1);
			}
	

		}
	}

}

