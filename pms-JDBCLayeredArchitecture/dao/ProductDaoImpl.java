package com.ig.jdbc.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ig.jdbc.pms.model.Product;
import com.ig.jdbc.pms.util.DbUtil;

public class ProductDaoImpl implements ProductDao{

	public void addProduct(Product product) throws Exception{
	  Connection con=DbUtil.getConnection();
	  PreparedStatement pst=con.prepareStatement("insert into product values (?,?)");
	  pst.setInt(1,product.getId());
	  pst.setString(2, product.getName());
	  pst.execute();
		
	}
	
	public List<Product> listAllProducts() throws Exception{
		ArrayList<Product> productList=new ArrayList<>();
		  Connection con=DbUtil.getConnection();
			Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from product");
		while(rs.next()) {
			Product product=new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			productList.add(product);
		}
		return productList;
	}
}
