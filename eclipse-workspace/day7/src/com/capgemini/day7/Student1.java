package com.capgemini.day7;

public class Student1 {

	int rollno;
	String name;
	String name1;
	
	public Student1(int rollno, String name, String string) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.name1=string;
	}
	
	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", name1=" + name1 + "]";
	}
	
}
