package com.insight.conucrrency;
import java.util.*;
public class WorkerTest {
public static void main(String[] args) throws InterruptedException 
	{
	List<Integer> myList = new ArrayList<>();
	for(int i=0;i<10;i++){
		myList.add(new Random().nextInt(100));
}
	System.out.println(myList);
//Collections.sort(myList);
long start=System.currentTimeMillis();
Worker worker =new Worker(myList);
Thread t = new Thread(worker);
t.start();
t.join();
long end=System.currentTimeMillis();

System.out.println("Time taken to sort: " +   ( end-start )+ " milliseconds");

  System.out.println(myList);
}}

