package com.capgemini.Oops;

interface bus
{
	public void travel();
}

interface train
{
	public  void travel2();
}

class pen1 implements bus,train
{
	@Override
	public void travel2() {
		// TODO Auto-generated method stub
		System.out.println("travel in train");
	}
	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("travel in bus");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pen1 s=new pen1();
		s.travel2();
		s.travel();
	}

}
