package com.insight.day2.innerclasses;


class Emp{   //emp has dept
	Integer id;
	String name;
	
	Dept dept;

	
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	public Emp(Integer id, String name, Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
	
	
	
}

class Dept{
	Integer did;
	String dname;
	
	class Inner{
		
	}
	public Dept(Integer did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}
	
	
}
public class HasDemo {

	public static void main(String[] args) {
		
      Emp e=new Emp(101,"IGUSer123",new Dept(10,"IT"));
      System.out.println(e);
	}

	

}
