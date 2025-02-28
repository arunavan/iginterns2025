package com.ig.jdbc.pms.service;

import java.util.ArrayList;
import java.util.List;

import com.ig.jdbc.pms.dao.ProductDao;
import com.ig.jdbc.pms.dao.ProductDaoImpl;
import com.ig.jdbc.pms.model.Product;

public class ProductServiceImpl  implements ProductService{
    ProductDao productDao;
	public void addProduct(Product product) throws Exception {
		productDao =new ProductDaoImpl();
		productDao.addProduct(product);
	}
	public List<Product> listAllProducts() throws Exception{
		//ArrayList<Product> productList=new ArrayList<>();
		productDao =new ProductDaoImpl();
		
		return productDao.listAllProducts();
}

}