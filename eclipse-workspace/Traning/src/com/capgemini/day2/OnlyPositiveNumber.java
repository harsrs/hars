package com.capgemini.day2;

public class OnlyPositiveNumber extends Exception {

	    OnlyPositiveNumber(String msg) {
	        super(msg);
	    }
	}
	class Sum {
	    public int add(int a, int b) throws OnlyPositiveNumber {
	        if (a > 0 && b > 0) {
	            System.out.println(a + b);
	        } else {
	            throw new OnlyPositiveNumber("Enter Positive Number");
	        }
	        return a+b;
	    }
	
}
