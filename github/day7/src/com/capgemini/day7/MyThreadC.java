package com.capgemini.day7;

public class MyThreadC extends Thread {

	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+ i);
		}
	}

}
