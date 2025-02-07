package com.oops;



//Object   - java.lang.Object 
//getclass(),hashCode,equals(),finalize()
//wait , notify(), notifyAll()
//clone - 
public class Employee implements Cloneable {
	
	private Integer id;
	private String name;
	
	public Object clone()  throws CloneNotSupportedException{
		return super.clone();
	}
	
	public Employee(Integer id, String name) {
		
		this.id = id;
		this.name = name;
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
	/*
	public int hashCode() {
		return this.id.hashCode();
	}
	
	
	public boolean equals(Object o) {
		Employee e1=(Employee)o;
		boolean flag=false;
		if( (this.id==e1.id) && this.name.equals(e1.name))
			 flag=true;
		return flag;  // control will go hashcode
	}
	*/
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	public void finalize(){
		id=null;
		name=null;
	}
	
	/*
	 * public void disp() { System.out.println(id +"  "+name); }
	 */
	
	

}
