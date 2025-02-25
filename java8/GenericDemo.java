package com.insight.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Arith1<T>{  //custom FI
	T op(T a,T b);
}
public class GenericDemo {
	public static void main(String[] args) {
	
		Arith1<Integer> i=(a,b)->a+b;
		System.out.println(i.op(45, 67));
		
		Arith1<Long> l=(a,b)->a*a+b*b;
		System.out.println(l.op(4l, 6l));
		
		//inbuilt FI
		Consumer<Integer> c=(x)->System.out.println(x*x*x);
		c.accept(7);
		
		Supplier<Integer> s=()->99;
		System.out.println(s.get());
		
		Predicate<Integer> p=(x)->x%2==0;
		System.out.println(p.test(5));
		
		Function<Integer,Integer>  f=(x)->x*x;
		System.out.println(f.apply(8));
		
		List<Integer> list=Arrays.asList(3,4,5,6,7,8);
		//using lambda
		//list.forEach(x->System.out.println(x));
		// method ref ::
		list.forEach(System.out::println);
		
	}

}
