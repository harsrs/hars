package com.capgemini.day6;

import java.util.Collections;
import java.util.TreeSet;

public class MyTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>(Collections.reverseOrder());
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		System.out.println(ts);
	}

}
