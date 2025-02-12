package com.insight.day4.collections.task;

public class Account {
	Integer id;
	
	String name;
	Double balance;
	public Account(Integer id, String name, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	

}
