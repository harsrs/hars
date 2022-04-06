package com.capgemini.day2;

public class Car {

	
		// TODO Auto-generated method stub
		String name;
		String color;
		double rate;
		
		Car(String a, String b, double c)
		{
			this.name=a;
			this.color=b;
			this.rate=c;
		}
		
		public static void main(String [] args)
		{
			Car s=new Car("zen", "white", 2000000);
			System.out.println(s.name);
			System.out.println(s.color);
			System.out.println(s.rate);
		}
	
}
