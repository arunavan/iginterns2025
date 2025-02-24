package com.insight.conucrrency;

import java.util.Collections;
import java.util.List;

public class Worker implements Runnable{
volatile	int x;//11  5    9
List<Integer> list;
	public Worker(List<Integer> list) {
			this.list = list;
		}
@Override
public void run() {
Collections.sort(list);
}
}
