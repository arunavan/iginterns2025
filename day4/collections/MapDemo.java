package com.insight.day4.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Course{
	Integer id;
	String name;
	public Course(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
public class MapDemo {

	public static void main(String[] args) {
		
	//	TreeMap<Integer,String> map=new TreeMap<>();
		Hashtable<Integer,String> map=new Hashtable<>();// concurrent
		map.put(13, "java");
		map.put(12, "python");
		map.put(11, "java");
		map.put(10, "python");
		map.put(177, "rest");
		map.put(18, null);
		map.put(19, "spring");
		map.put(29, null);
	//	map.put(null, "hibernate");
		System.out.println(map);
		System.out.println(map.remove(18));
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		
		Collection<String> vals=map.values();
		System.out.println(vals);
		
		//Entry
		
		Set entries=map.entrySet();
		Iterator i=entries.iterator();
		while(i.hasNext()) {
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()   +"  "+entry.getValue());
		}
		
		HashMap<Integer,Course> courseMap=new HashMap<>();
		courseMap.put(10,new Course(123,"java"));
		
		

	}

}
