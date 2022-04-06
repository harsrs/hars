package com.capgemini.Oops;

class Child
{
	String name="harshitha";
	String Brother="jashwanth";
	public void teaching()
	{
		System.out.println("java");
	}
}

class Student extends Child
{
	String name="Radha";
	public void learning()
	{
		System.out.println("Srinivas Reddy");
	}
}

public class SingleLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		System.out.println(s.name);
		s.teaching();
		s.learning();
		Child t=new Child();
		t.teaching();
		System.out.println(t.name);
	}

}
