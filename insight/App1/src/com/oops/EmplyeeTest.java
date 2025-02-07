package com.oops;

public class EmplyeeTest   {

	public static void main(String[] args)  throws CloneNotSupportedException{
		Employee e=new Employee(10,"user1");
		Employee e1=new Employee(10,"user");
		System.out.println("before :"+e1+"  "+e1.hashCode());
		Employee e2=(Employee)e1.clone();
		 System.out.println("after"+e2  +e2.hashCode());
		
		System.out.println(e.equals(e1));
		String s="sava123";
		System.out.println("java".compareTo(s)); //+ve , -ve ,0
		//Employee e1=e;
		System.out.println(s instanceof String);
	
		System.out.println(e.getClass());
		
		System.out.println("java".equals(s)); // boolean
		System.out.println(e1==e);
		
		
		
		e.setId(101);
		e.setName("ram");
		System.out.println(e);//toString()
		System.out.println(e.hashCode());
		//e.disp();
		//System.out.println(e.getId()+"  "+e.getName());

	}

}
