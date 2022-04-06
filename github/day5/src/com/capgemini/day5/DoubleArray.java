package com.capgemini.day5;

public class DoubleArray {
	
	public static void main(String[] args) {
		double [][]arr=new double[2][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		for(double[] i:arr)
		{
			for(double j:i)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
