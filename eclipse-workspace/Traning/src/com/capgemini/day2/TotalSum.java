package com.capgemini.day2;

import java.util.Scanner;

public class TotalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		System.out.println("the value is:" + sum);
	}

}
