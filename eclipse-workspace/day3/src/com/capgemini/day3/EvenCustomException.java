package com.capgemini.day3;

import java.util.Scanner;

public class EvenCustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("it is even number");
		}
		else
		{
			System.out.print("it is not even number");
		}
	}

}
