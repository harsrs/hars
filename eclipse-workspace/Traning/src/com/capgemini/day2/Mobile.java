package com.capgemini.day2;

public class Mobile {
	
	String name;
	 int id;
	
	Mobile(String n, int i)
	{
		this.name=n;
		this.id=i;
	}
	public static void main(String [] args)
	{
		Mobile e=new Mobile("iphone", 10);
		System.out.println(e.name+ "," + e.id);
	}
	
		
	

}
