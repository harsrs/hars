package com.capgemini.day5;

class Employee
{
	String name;
	int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
}
public class MyList {
	public static void main(String[] args) {
		 Employee s=new Employee("Harshitha", 9);
		 System.out.println(s);
		 
	 
	}

}
