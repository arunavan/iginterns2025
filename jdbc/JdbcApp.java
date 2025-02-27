package com.ig.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;
public class JdbcApp {
	public static void main(String[] args) throws Exception{
	//step1	
	Class.forName("com.mysql.cj.jdbc.Driver");
	//step 2
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ig","root","root");
	//	System.out.println(" connection is success");
		//step3 
		Statement st=con.createStatement();
		con.setAutoCommit(false);
	//	st.executeUpdate("create table hospital(id int primary key ,name varchar(20)) ");
	//	System.out.println(" table created ");
	//	st.execute("insert into hospital values(154,'Medicover')");
		//st.execute("insert into hospital values(267,'Medicover78')");
		//st.execute("insert into hospital values(378,'Medicover56')");
		st.executeUpdate("update hospital set name='AIG' where id=2");
		st.executeUpdate("delete from  hospital where id=3");
		con.rollback();
		con.commit();
		Scanner sc=new Scanner(System.in);
		PreparedStatement pst=con.prepareStatement("insert into hospital values(?,?)");
		// update hospital set name=? where id=?
		
		//delete from hospital where id=?
		
		System.out.println("entre  3 hospital details");
		for(int i=1;i<=3;i++) {
			pst.setInt(1,sc.nextInt()); sc.nextLine();
			pst.setString(2, sc.nextLine());
			pst.execute();
		}
			
		System.out.println("inserted...");
		
		//ResultsetMetaData rsmd=rs.getMetaData();
		ResultSet rs=st.executeQuery("select * from hospital");
		
		DatabaseMetaData dbms=con.getMetaData();
		System.out.println(dbms.getDriverName());
		
		ResultSetMetaData rsmd=rs.getMetaData();
		
		System.out.println(rsmd.getColumnCount());
		
		for(int i=1;i<=rsmd.getColumnCount();i++)
			System.out.print(rsmd.getColumnName(i)+"  ");
		System.out.println("=========");
		while(rs.next()) {
			System.out.println(rs.getString(1)+"  "+rs.getString(2));
		}
		
		
		

	}

}
