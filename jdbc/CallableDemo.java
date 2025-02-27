package com.ig.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class CallableDemo {

	public static void main(String[] args)  throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ig","root","root");
		//	System.out.println(" connection is success");
			//step3 
			CallableStatement cst=con.prepareCall("{CALL arithsq(?,?)}");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			cst.setInt(1,a);
			cst.registerOutParameter(2,Types.INTEGER);
			cst.execute();
			int b=cst.getInt(2);
			System.out.println("REsult"+b);
}

}
/*
 * 
DELIMITER $$
CREATE PROCEDURE addnum(in x int  ,out y int )
BEGIN
   set y =x*x;
END $$
DELIMITER ;

*/
