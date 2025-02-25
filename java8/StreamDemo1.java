package com.insight.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(12,123,145,160,15,16,34,56,78,89,78,67);
		
		list.parallelStream().filter(x->x>100).filter(x->x%2!=0).limit(2).forEach(x->System.out.println(x));
		
		Stream<String> s=Stream.of("java","python","spring","rest","webs","micr");
		s.filter(ss->ss.length()==4).skip(1).forEach(System.out::println);
		//s.forEach(x->System.out.println(x));
		
		List<String> l1=Arrays.asList("java","python","spring","rest","webs","micr");
		l1.parallelStream().forEach(x->System.out.println(x));
		System.out.println("=====");
		
		//l1.stream().limit(4).forEach(x->System.out.println(x));
		List<String> l2=l1.stream().limit(4).collect(Collectors.toList());
		l2.forEach(System.out::println);
		//Long count=l1.stream().filter(s->s.startsWith("j")).count();
		//System.out.println(count);
		

	}

}
