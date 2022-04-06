package com.capgemini.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


public class List {
	public static void main(String[] args) {
		ArrayList<Integer> Is=new ArrayList<Integer>();
		Is.add(15);
		Is.add(10);
		
		Collections.sort(Is,Collections.reverseOrder());
		System.out.println(Is.contains(100));
	
		System.out.println(Is.equals(35));
		
		System.out.println(Is);
		
		
		Iterator<Integer> it=Is.iterator();
		while(it.hasNext())
		{
			System.out.println("it" +it.next());
		}
		Is.size();
		Is.set(0, 200);
		System.out.println(Is);
		
	}
                                                   
}
