package com.ig.jdbc.pms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;

public class DbUtil {


	public static Connection getConnection()  throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ig","root","root");
		return con;
	
	}}
