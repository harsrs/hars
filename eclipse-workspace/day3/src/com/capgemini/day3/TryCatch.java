package com.capgemini.day3;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a=10;
			int b=0;
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("finally");
		}
		finally
		{
			System.out.println("finally output");
		}
				
	}

}
