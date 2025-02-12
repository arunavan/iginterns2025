package com.insight.day4.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Product{
	Integer id;
	String name;
	Integer qty;
	Double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Product(Integer id, String name, Integer qty, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
}

public class IODemo {

	public static void main(String[] args) throws IOException {
		
		FileReader f1=new FileReader("C:\\Javatraining\\product.txt");
		//1  given prodict is ---10 return product object 
		
		BufferedReader b=new BufferedReader(f1);
		String line=null;
		while( (line=b.readLine())!=null) {
			System.out.println(line);
		}
		
		
	}

}
