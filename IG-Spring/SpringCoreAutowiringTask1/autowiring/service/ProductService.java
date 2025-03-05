package com.ig.autowiring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.ig.autowiring.model.Product;
import com.ig.autowiring.repository.ProductRepo;

@Component
public class ProductService  {
	@Autowired  //automatic di, field di ,constructor di
	ProductRepo productRepo;
	/*
	  @Autowired 
	  public ProductService(ProductRepo productRepo) 
	  { this.productRepo = productRepo; 
	  }
	 */


	public ProductRepo getProductRepo() {
		return productRepo;
	}
  //  @Autowired
	public void setProductRepo(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}

	public void addProduct(Product product) {
		//ProductRepo productRepo=new ProductRepo();
		productRepo.addProduct(product);
		System.out.println("product added..."+product.getId());
	}
	public List<Product> getAllProducts(){
		return productRepo.getAllProducts();
	}

	  public Product getProduct(Integer id) {
		  return productRepo.getProduct(id);
	  }

}
