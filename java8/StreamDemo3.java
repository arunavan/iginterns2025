package com.insight.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo3 {

	public static void main(String[] args) {
	
		
		List<String> names=Arrays.asList("Payal","Bhavya","Roopa","Abc","Sai","Manideep","Harsha","JanakiRam");
		names.stream().map(x->x.length()).forEach(n->System.out.println(n));
		names.stream().map(x->x.toUpperCase()).forEach(n->System.out.println(n));
		System.out.println(" sorted list");
		names.stream().sorted().forEach(n->System.out.println(n));
		
		System.out.println(" names lengthwise descending sorted list");
		                         //compare
		Comparator<String> comp=(n1,n2)->n2.length()-n1.length();
		
		names.stream().sorted(comp).forEach(n->System.out.println(n));
		
		names.stream().filter(n->n.equals("Sai")).forEach(x->System.out.println(x));
		names.stream().filter(n->n.endsWith("a")).forEach(x->System.out.println(x));
		
		
		
	}

}
