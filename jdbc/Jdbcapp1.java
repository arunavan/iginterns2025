package com.ig.jdbc;

public class Jdbcapp1 {

	

	public static void main(String[] args)  throws Exception{
		DbUtil.getConnection();
		System.out.println(" connection success");
	}

}
