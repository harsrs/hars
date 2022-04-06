package com.capgemini.day3;

import java.util.Scanner;

class EnterEventException extends Exception{
	EnterEventException(String msg)
	{
		super(msg);
	}
}
public class EventException {

	public static void main(String[] args) throws EnterEventException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int b=sc.nextInt();
		if(b%2==0)
		{
			System.out.println("given number is even");
		}
		else
		{
			throw new EnterEventException("a even");
		}
	}

}
