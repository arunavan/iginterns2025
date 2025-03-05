package com.ig.autowiring.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ig.autowiring.model.Product;
@Component
public class ProductRepo {
  static	List<Product> plist=new ArrayList<>();
	
	static {
	  plist.add(new Product(10,"pen"));
	 plist.add(new Product(20,"bag"));
	 plist.add(new Product(30,"tin"));
	}
	public void addProduct(Product product) {
		plist.add(product);
	//	System.out.println(plist);
	}
	//update, delete,list,list1 product
	
	public Product getProduct(Integer id) {  //to get single product
		Product p1=new Product();
		for(Product p:plist) {
			if(p.getId()==id) {
				p1.setId(p.getId());
			    p1.setName(p.getName());
			}
		}
		return p1;
		
	}
	
	
	public List<Product> getAllProducts(){
		
	 return plist;
	}
	
	
	

}
