package com.insight.day4.collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
public class SetDemo {
	public static void main(String[] args) {
		//HashSet<Integer> l=new HashSet<>();
		//LinkedHashSet<Integer> l=new LinkedHashSet<>();
		TreeSet<Integer> l=new TreeSet<>();//comparator
		//Collections.synchronizedSet(null)
		l.add(23);
		l.add(3);  //autoboxing
		l.add(45);
		l.add(1);
		l.add(6);
		l.add(99);
		l.add(3);
		l.add(1);
		l.add(6);
		System.out.println(l);
		//System.out.println(l.indexOf(3));
		l.remove(3);
		System.out.println(l);
		
		//l.clear();
		System.out.println(l.isEmpty());
		System.out.println(l.contains(6));
		List<Integer> l1=Arrays.asList(2,3,4,5);
		l.addAll(l1);  //union
		System.out.println(l);
		//l.removeAll(l1); //minus
		//l.retainAll(l1);  //intersetion
		System.out.println(l);
		System.out.println(l.containsAll(l1));
		
		
		/*
		 * for(int i=0;i<l.size();i++) System.out.println(l.get(i));
		 */	 
				System.out.println(" for each");
		for(Integer it:l)
			System.out.println(it);
		System.out.println(" iterator");
		Iterator<Integer> itr=l.iterator();
		
		while(itr.hasNext()) { //fwd
			//Integer x=itr.next();
				//	if(x==4)
				//		itr.remove();
			System.out.println(itr.next());
		}
		
		
		/*
		 * ListIterator<Integer> lt=l.listIterator(); //fwd and rev while(lt.hasNext())
		 * { System.out.println(lt.next()); } while(lt.hasPrevious()) {
		 * System.out.println(lt.previous()); }
		 */
		/*
		System.out.println(" enumeration ");
		Enumeration<Integer> en=l.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		*/
		System.out.println(" ==== java8 - lambda======");
		l.forEach(x->System.out.println(x));
		System.out.println(" ==== java8 -:: method reference======");
		l.forEach(System.out::println);
		/*
		 * Stack<Integer> s=new Stack(); s.push(34); s.push(12);
		 * System.out.println(s.pop()); s.clear(); System.out.println(s.isEmpty());
		 */
		

	}

}
