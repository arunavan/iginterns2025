package com.ig.autowiring.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ig.autowiring.model.Product;
import com.ig.autowiring.service.ProductService;

public class ProductTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AutowiringConfig.class);
		ProductService productService=(ProductService)context.getBean(ProductService.class);
		
	//	ProductService ps=new ProductService();//
		
		
		Product product=new Product(40,"box");
	
		productService.addProduct(product);
		
		System.out.println(" Listing all products....");
		
	List<Product> plist=productService.getAllProducts();
		plist.stream().forEach(x->System.out.println(x));
	
		System.out.println(" get single product");
		System.out.println(productService.getProduct(10));
		
	}

}
