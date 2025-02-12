package com.ey.collections.task;


public class Product {
	Integer id;
	String name;
	public Product(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		
		return this.id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
	
		Product other = (Product) obj;
		if(this.id==other.id  && this.name.equals(other.name))
			return true;
		else
			return false;
	}
	
	
	
}
