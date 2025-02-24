package com.insight.conucrrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorExample1 {

    public static void main(String[] args)  throws Exception{

        ExecutorService executor = Executors.newFixedThreadPool(5);
        // Before Java 8
        executor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm Runnable task.");
            }
        });
        
        ExecutorService executor1 = Executors.newSingleThreadExecutor();
        // return 10
         Callable task2=()->10;
         
        Future<Integer> result = executor1.submit(task2);
        Future<String> message=executor1.submit(()->"welcome to Executor Service");
        System.out.println(result.get());
        System.out.println(message.get());
        executor1.close();
                 
        int x=10;
        
        AtomicInteger  x1= new AtomicInteger(10);
        
        
        
        // Runnable, return void, nothing, submit and run the task async
        //executor.submit(() -> System.out.println("I'm Runnable task."));

        // Callable, return a future, submit and run the task async
        /*
        
        executor(futureTask1);
         System.out.println(futureTask1.get());*/
         
      
  }
}
