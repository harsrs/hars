package com.capgemini.day2;

import java.util.Scanner;

public class LargestThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, largest;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First number");
		a=s.nextInt();
		System.out.println("Enter the Secound number");
		b=s.nextInt();
		System.out.println("Enter the Third number");
		c=s.nextInt();
 		largest=c>(a>b?a:b)?c:((a>b)?a:b);
		System.out.println("The largest number is" + largest);
	}

}
