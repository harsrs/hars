package com.capgemini.day3;

import java.util.Scanner;

class OnlyPositiveNumberAllowed extends Exception
{
	OnlyPositiveNumberAllowed(int age)
	{
		super();
	}
}

public class customException {

		// TODO Auto-generated method stub
		public static void main(String [] args)
		{
			Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
			if(age>18)
			{
				System.out.println(age);
			}
			else
			{
				System.out.println("age is allowed");
			}
		}
		
}
