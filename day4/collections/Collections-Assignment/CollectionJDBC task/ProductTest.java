package com.ey.collections.task;

import java.util.List;

public class ProductTest {

	public static void main(String[] args) {  //rest, run, ui,
		ProductService ps=new ProductService();

		//menu should be displayed, take user choice to perform operation, 1...5
		
		Product product=new Product(10,"box");
		Product product1=new Product(11,"box1");
		
		String result=ps.addProduct(product);
		String result1=ps.addProduct(product1);
		
		System.out.println(result);
		
		ps.listProducts();

	}

}
