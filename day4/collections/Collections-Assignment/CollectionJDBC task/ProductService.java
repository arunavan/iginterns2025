package com.ey.collections.task;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	static List<Product> plist=new ArrayList<>();
	
	public String addProduct(Product p) {
		plist.add(p);
		return "success";
		
	}
	public int deleteProduct(Product p) { //to be  implement
		return 1;
	}
	public int updateProduct(Product p) {//to be  implement
		return 1;
	}
	public void  listProducts(){
		plist.forEach(x->System.out.println(x));
	}
	public Product getProduct(Integer id) {//to be  implement
		return new Product(12,"box");
	}
}
