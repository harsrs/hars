package com.capgemini.day6;

import java.util.HashSet;

public class HashCode {
	public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println(set);
		
		Object[] arr=set.toArray();
		System.out.println(arr.length);
		for(Object obj:arr)
		{
			System.out.println((Integer)obj);
		}
		
		set.clear();
		set.contains(10);
		set.forEach(System.out::println);
		set.isEmpty();
		set.remove(10);
		set.size();
	}

}
