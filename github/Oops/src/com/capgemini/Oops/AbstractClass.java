package com.capgemini.Oops;

abstract class goa
{
	public void beach()
	{
		System.out.println("water in beach");
	}
}

class banglore extends goa
{
	public void lake()
	{
		System.out.println("water in lake");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		banglore r=new banglore();
		r.lake();
		r.beach();
	}

}
