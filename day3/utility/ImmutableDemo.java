package com.insight.day3.utility;
//immmutable 
//public, protected,default,private
//static ,abstract,final,synchronized ,volatile,native ,strictfp
final class Product{
	private final  Integer id;
	private final String name;
	private final Double price;
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public Product(Integer id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
}
public class ImmutableDemo {
	public static void main(String[] args) {
		Product p=new Product(101,"box",999.99);
		System.out.println(p);
		
	}

}
