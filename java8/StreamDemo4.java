package com.insight.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {


	public static void main(String[] args) {
	// map, filter,distinct, skip, limit,sorted,min , max
		//forEach, collect, count,reduce
		
		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4); 
	    Integer min = list.stream().min(Integer::compare).get();  
	    System.out.println("min :"+min);
	    
	    Integer max = list.stream().max(Integer::compare).get(); 
	    System.out.println("max :"+max);
	    

	    Stream<String> s = Stream.of("3", "4", "5"); 
  
        double ans = s.collect(Collectors.averagingDouble(num -> Double.parseDouble(num))); 
        System.out.println("Double average:"+ans);
        Stream<String> s1 = Stream.of("3", "4", "5"); 
        
        double ans1 = s1.collect(Collectors.averagingInt(num -> Integer.parseInt(num))); 
        System.out.println("Double average:"+(int)ans1);
        
        List<Integer> l2=Arrays.asList(20,30,11,18,29,10,123,198);
        // display list of numbers starting with 1
        //11,18,10,123,198
        
        
        String name="insightglobal";
        //display occurance of characters  in given string using map and stream api
        // i=2 n=1 s=1 g=2 h=1 t=1 l=2 o=1 b=1 a=1
        
        List<String> palindromesList=Arrays.asList("madam","liril","aba","tomato","apple");
        //display lowest length palindrome from list using stream api
        //aba
        
        
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("java", "python"),
                Arrays.asList("mysql", "oracle"),
                Arrays.asList("webservice", "microservices")
            );

            // Using Stream flatMap(Function mapper)
            listOfLists.stream()
                       .flatMap(li -> li.stream())
                       .forEach(System.out::println);
        
            List<String> li1 = Arrays.asList("Java", "Spring", "Hibernate", "Microservices");

            // Using Stream flatMap(Function mapper)
            li1.stream()
              .flatMap(str -> Stream.of(str.charAt(2)))
              .forEach(System.out::println);
            
            
            
            
            
            List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);
            List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
            List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

            List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

            System.out.println("The Structure before flattening is : " + listOfListofInts);

            List<Integer> listofInts = listOfListofInts.stream()
                                        .flatMap(lt -> lt.stream())
                                        .collect(Collectors.toList());

            
            List<Integer> l9=Arrays.asList(4,5,6);
            l9.stream().map(x->x*x).forEach(n->System.out.println(n));
            
           
            System.out.println("The Structure after flattening is : " + listofInts);
        
   List<String> list1= Arrays.asList("java", "jee", "java","jee","jee","python");

    // Collect the list as map
    // by groupingBy() method
    Map<String, Long> result = list1.stream().collect( Collectors.groupingBy(
                				Function.identity(),
                				Collectors.counting()));
    // Print the result
    System.out.println(result);

	}

}



