package com.capgemini.day5;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOperator {
	public static void main(String[] args) {
		LinkedList<Integer> Is=new LinkedList<Integer>();
		Is.add(10);
		Is.add(20);
		Is.add(30);
		Is.add(40);
		
		Collections.sort(Is,Collections.reverseOrder());
		System.out.println(Is.contains(400));
		System.out.println(Is.equals(35));
		Is.forEach(System.err::println);
		
		System.out.println(Is.isEmpty());
		System.out.println(Is);
		Iterator<Integer> it=Is.iterator();
		while(it.hasNext())
		{
			System.out.println("it"+it.next());
		}
		
		Is.size();
		Is.set(0, 200);
		System.out.println(Is);
		Is.addFirst(1);
		Is.addLast(1000);
		System.out.println(Is);
		
		Iterator<Integer> rit=Is.descendingIterator();
		while(rit.hasNext())
		{
			System.out.println(rit.next());
		}
		System.out.println(Is.getFirst());
		
		System.out.println(Is.getLast());
		
		Is.offer(10001);
		System.out.println(Is);
		System.out.println(Is.peek());
		
		System.out.println(Is.peekFirst());
		System.out.println(Is.peekLast());
		
		System.out.println(Is.poll());
		System.out.println(Is.pollFirst());
		System.out.println(Is.pollLast());
		System.out.println(Is);
		
		Is.removeFirst();		
		Is.removeLast();
	}

}
