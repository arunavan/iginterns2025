package com.insight.day1;

import static com.oops.Employee.*;

public class Varargdemo {
	
	static int sum123(int... a) {
		int s=0;
		for(int i=0;i<a.length;i++) {
			s+=a[i];
		}
		return s;
	}
	public static void main(String[] args) {
		int x1[]= {3,5,6};
		int x=100;
		System.out.println(sum123(x1));
		int x2[]= {534,622,123,321};
		System.out.println(sum123(x2));
		System.out.println(x +  "  "+y);
		
	}

}
