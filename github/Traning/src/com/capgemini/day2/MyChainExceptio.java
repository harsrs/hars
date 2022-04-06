package com.capgemini.day2;

public class MyChainExceptio {

	public static void main(String[] args) throws OnlyPositiveNumber {
		// TODO Auto-generated method stub
		callingMEthod();
	}
	public static void callingMEthod() throws OnlyPositiveNumber
    {
        Sum sum=new Sum();
        int num=sum.add(10, 20);
        //result
        //exception
    }
}
