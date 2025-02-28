package com.ig.jdbc.pms.ui;

import java.util.Scanner;

import com.ig.jdbc.pms.model.Product;
import com.ig.jdbc.pms.service.ProductService;
import com.ig.jdbc.pms.service.ProductServiceImpl;

public class PmsUIApplication {
	
	public static void main(String[] args)  throws Exception {
		ProductService productService=new ProductServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product Details");
		Product product=new Product();
		product.setId(sc.nextInt());sc.nextLine();
		product.setName(sc.nextLine());
		
		 productService.addProduct(product);
		
		 // getGivenProduct     - throw 
		 // updateGivenProduct   -
		 //deletGivenProduct   -
		
		System.out.println("=====List all products=============");
		productService.listAllProducts().forEach(p->System.out.println(p));;
		
	}

}
