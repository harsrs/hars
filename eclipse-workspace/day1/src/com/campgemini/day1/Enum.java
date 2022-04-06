package com.campgemini.day1;

public class Enum {
	
	enum Day{
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday 
	}
	
	enum Month{
		January, February, March, April, May, June, July, August, September, October, November, December
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Day.Monday);
		System.out.println(Day.Tuesday);
		System.out.println(Day.Wednesday);
		System.out.println(Day.Thursday);
		System.out.println(Day.Friday);
		System.out.println(Day.Saturday);
		
		System.out.println(Month.valueOf("January"));
		System.out.println(Month.valueOf("February"));
		System.out.println(Month.valueOf("March"));
		System.out.println(Month.valueOf("April"));
		System.out.println(Month.valueOf("May"));
		System.out.println(Month.valueOf("June"));
		System.out.println(Month.valueOf("July"));
		System.out.println(Month.valueOf("August"));
		System.out.println(Month.valueOf("September"));
		System.out.println(Month.valueOf("October"));
		System.out.println(Month.valueOf("November"));
		System.out.println(Month.valueOf("December"));
	}

}
