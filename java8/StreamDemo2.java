package com.insight.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

	

	public static void main(String[] args) {
	
		//1
		
		Stream s=Stream.of(2,1,3,4,5,2,7,8,3,4,5,2,3,4);
		//lambda
		s.forEach(x->System.out.println(x));
		//s.forEach(System.out::println);   // throw error
		//  :: method reference
		System.out.println("Method ref");
		
		List<Integer> list=Arrays.asList(2,1,3,4,5,2,7,8,3,4,5,2,3,4);
		list.stream().forEach(System.out::println);
		//unique
		System.out.println("distinct");
		list.stream().distinct().forEach(System.out::println);
		System.out.println("== below 5, uniqie, top 2");
		list.parallelStream().skip(3).filter(x->x<=5).distinct().limit(2).forEach(System.out::println);
		// first 5 elements squares 
		list.stream().limit(5).map(x->Math.pow(x,2)).forEach(System.out::println);
		// sorted
		System.out.println(" sorted order");
		list.stream().limit(5).sorted().forEach(x->System.out.println(x));
		System.out.println(" reverse sorted order");
		list.stream().limit(5).sorted(Collections.reverseOrder()).forEach(x->System.out.println(x));
		//count of even numbers
		System.out.println("===count===");
		long count=list.stream().filter(x->x%2==0).count();
		System.out.println(count);
		System.out.println("====sum====");
		int sum=list.stream().limit(5).reduce((a,b)->a+b).get();
		System.out.println(sum);
		
		
	}

}
