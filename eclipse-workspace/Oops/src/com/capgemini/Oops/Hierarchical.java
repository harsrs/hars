package com.capgemini.Oops;

class a
{
	public void A()
	{
		System.out.println("print A");
	}
}

class b extends a
{
	public void B()
	{
		System.out.println("print B");
	}
}

class c extends a
{
	public void C()
	{
		System.out.println("print C");
	}
}	

public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c r=new c();
		r.A();
		r.C();
		b s=new b();
		s.A();
		s.B();
		c t=new c();
		t.A();
	}

}
