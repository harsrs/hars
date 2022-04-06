package com.capgemini.day7;

public class MyThreadClass {
	
	public static void main(String[] args) {
		
		MyThreadC t1=new MyThreadC();
		MyThreadC t2=new MyThreadC();
		t1.setName("A");
		t2.setName("B");
		t2.setPriority(10);
		t1.start();
		t2.start();
		
	}

}
