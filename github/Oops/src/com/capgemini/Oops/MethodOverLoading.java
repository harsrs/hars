package com.capgemini.Oops;

class Flight
{
	public void aeroplane()
	{
		System.out.println("Landing");
	}
	public void aerospace()
	{
		System.out.println("space comprising");
	}
	public void bird()
	{
		System.out.println("peacock");
	}
}

class fly extends Flight
{
	public void animal()
	{
		System.out.println("lion");
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight r=new Flight();
		r.aeroplane();
		r.aerospace();
		r.bird();
		fly s=new fly();
		s.animal();
				
	}

}
