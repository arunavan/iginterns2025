package com.ig.jdbc.pms.dao;

import java.util.List;

import com.ig.jdbc.pms.model.Product;

public interface ProductDao {  // add, delete, get,getall,update

	public void addProduct(Product product) throws Exception;
	
	public List<Product> listAllProducts() throws Exception;
}
