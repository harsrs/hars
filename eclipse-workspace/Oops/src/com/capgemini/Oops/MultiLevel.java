package com.capgemini.Oops;

class pen
{
	public void A()
	{
		System.out.println("print A");
	}
}

class book extends pen
{
	public void B()
	{
		System.out.println("print B");
	}
}

class blue extends book
{
	public void C()
	{
		System.out.println("print C");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		blue r=new blue();
		r.A();
		r.B();
		r.C();
		book s=new book();
		s.A();
		s.B();
		pen t=new pen();
		t.A();
		
	}

}
