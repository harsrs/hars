package com.capgemini.day7;

import java.util.HashMap;

public class MyLaptop {

	public static void main(String[] args) {
		
		HashMap<Integer, Laptop> map=new HashMap<Integer, Laptop>();
		map.put(9, new Laptop("hp", 10));
		map.put(8, new Laptop("dell", 11));
		map.put(7, new Laptop("lenovo", 10));
		map.put(6, new Laptop("acer", 11));
		
		System.out.println(map);
		
		
		
	}
}
