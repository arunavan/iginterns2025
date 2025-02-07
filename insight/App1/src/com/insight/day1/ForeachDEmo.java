package com.insight.day1;

import java.util.Arrays;
import java.util.List;
public class ForeachDEmo {
	public static void main(String[] args) {
		int a[]= {4,3,5,6,7,8};
		int b[]=new int[3];
		System.arraycopy(a, 2, b, 0, 2);
		System.out.println("Source:");
		for( int  x:a)
			System.out.print("  "+x);
		System.out.println("DEstination:");
		for( int  x:b)
			System.out.print("  "+x);
		
		System.out.println();
		List<Integer> list=Arrays.asList(2,31,4,5,6,7,8);
		list.forEach(x->System.out.println(x));
	}
}
