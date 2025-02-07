package com.insight;
import java.util.Date;
import com.oops.Employee;
//java.lang
public class Hello {
	public static void main(String[] args) {
		System.out.println("welcome..._____");
		System.out.println("Name:"+args[0]);
		System.out.println("Addres:"+args[1]);
		System.out.println("Todays date is "+ new Date());
		Employee e=new Employee();
		System.out.println(e.name  +"  "+e.id);
		System.out.println(InitializerDemo.city);
		InitializerDemo.sdisp();
		//InitializerDemo i=new InitializerDemo();
		//System.out.println(i.name);
		//i.sdisp();
		

	}

}
