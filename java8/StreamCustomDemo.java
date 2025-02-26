package com.insight.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Account{
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", branch=" + branch + "]";
	}
	public Account(Integer id, String name, Double balance, Branch branch) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
	}
	Integer id;
	String name;
	Double balance;
	Branch branch;
	
	
	
	
	
}


class Branch{
	Integer id;
	String name;
	
	
	public Branch(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + "]";
	}
	
}

public class StreamCustomDemo {



	public static void main(String[] args) {
		/*
		List<Account> accountList=Arrays.asList(new Account(897,"ram",90000.00),
				new Account(297,"kiran",30000.00),
				new Account(457,"amith",10000.00),
				new Account(197,"ram",80000.00),
				new Account(323,"bindu",70000.00));
		
		accountList.stream().map(a->a.name).forEach(n->System.out.println(n));
		
		List<Double> newList=accountList.stream().map(a->a.balance+500).collect(Collectors.toList());
		newList.forEach(System.out::println);
		 //sorting on name
		Comparator<Account> nameComp=(n1,n2)->n1.name.compareTo(n2.name);
		accountList.stream().sorted(nameComp).forEach(System.out::println);
		//id comparator
		Comparator<Account> idComp=(n1,n2)->n1.id-n2.id;
		accountList.stream().sorted(idComp).forEach(System.out::println);
		//balance amount comparator
		Comparator<Account> balanceComp=(n1,n2)->n1.balance.intValue()-n2.balance.intValue();
		accountList.stream().sorted(balanceComp).forEach(System.out::println);
			*/
		
		
		List<Account> accountList=Arrays.asList(new Account(897,"ram",90000.00,new Branch(10,"Hyd")),
				new Account(297,"kiran",30000.00,new Branch(10,"Hyd")),
				new Account(457,"amith",10000.00,new Branch(20,"Chennai")),
				new Account(197,"ram",80000.00,new Branch(30,"Pune")),
				new Account(323,"bindu",70000.00,new Branch(20,"Chennai")));
		
		Map<Branch,List<Account>> map= accountList.stream().collect(Collectors.groupingBy(Account :: Branch));
		
		
	}

}
