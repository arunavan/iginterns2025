package com.insight.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Department{
	int id;
	String dname;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", dname=" + dname + "]";
	}

	public Department(int id, String dname) {
		super();
		this.id = id;
		this.dname = dname;
	}
	
	
}


class Employee {
 int id;
 String name;
 Department department;
 int salary;
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Employee(int id, String name, Department department, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
}

 
 
}
	

class Account{
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", branch=" + branch + "]";
	}
	public Account(Integer id, String name, Double balance, Branch branch) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
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
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	Integer id;
	String name;
	Double balance;
	Branch branch;
	
	
	
	
	
}


class Branch{
	Integer id;
	String name;
	
	
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


	public Branch(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + "]";
	}
	
}

public class StreamCustomDemo {



	public static void main(String[] args) {
		/*
		List<Account> accountList=Arrays.asList(new Account(897,"ram",90000.00),
				new Account(297,"kiran",30000.00),
				new Account(457,"amith",10000.00),
				new Account(197,"ram",80000.00),
				new Account(323,"bindu",70000.00));
		
		accountList.stream().map(a->a.name).forEach(n->System.out.println(n));
		
		List<Double> newList=accountList.stream().map(a->a.balance+500).collect(Collectors.toList());
		newList.forEach(System.out::println);
		 //sorting on name
		Comparator<Account> nameComp=(n1,n2)->n1.name.compareTo(n2.name);
		accountList.stream().sorted(nameComp).forEach(System.out::println);
		//id comparator
		Comparator<Account> idComp=(n1,n2)->n1.id-n2.id;
		accountList.stream().sorted(idComp).forEach(System.out::println);
		//balance amount comparator
		Comparator<Account> balanceComp=(n1,n2)->n1.balance.intValue()-n2.balance.intValue();
		accountList.stream().sorted(balanceComp).forEach(System.out::println);
			*/
		
		
		List<Account> accountList=Arrays.asList(new Account(897,"ram",90000.00,new Branch(10,"Hyd")),
				new Account(297,"kiran",30000.00,new Branch(10,"Hyd")),
				new Account(457,"amith",10000.00,new Branch(20,"Chennai")),
				new Account(456,"amith",10000.00,new Branch(22,"Hyd")),
				new Account(458,"amith",10000.00,new Branch(23,"Chennai")),
				new Account(197,"ram",80000.00,new Branch(30,"Pune")),
				new Account(323,"bindu",70000.00,new Branch(20,"Chennai")));
		
		Map<String,List<Account>> map= accountList.stream().collect(Collectors.groupingBy(a->a.getBranch().getName()));
		
		System.out.println(map);
			
		// Creating Departments
			        Department hr = new Department(1, "HR");
			        Department it = new Department(2, "IT");
			        Department finance = new Department(3, "Finance");

			        // Creating Employees
			        List<Employee> employees = Arrays.asList(
			            new Employee(1, "Alice", hr, 50000),
			            new Employee(2, "Bob", it, 70000),
			            new Employee(3, "Charlie", hr, 55000),
			            new Employee(4, "David", it, 80000),
			            new Employee(5, "Eve", finance, 60000)
			        );
		        // Grouping employees by department name
			        Map<Object, List<Employee>> employeesByDept = employees.stream()
			            .collect(Collectors.groupingBy(e -> e.getDepartment().getDname()));

			        // Printing the grouped employees
			        employeesByDept.forEach((dept, empList) -> {
			            System.out.println("Department: " + dept);
			            empList.forEach(e -> System.out.println(" - " + e.getName() + " ($" + e.getSalary() + ")"));
			        });
			        
			        
			    
				
			
			
			
		
	}

}
