package caom.capgemini.day8;

import java.util.ArrayList;
import java.util.Collections;

public class MyStream {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		long count=list.stream().filter(e -> e<0).map(num->num*2).sorted(Collections.reverseOrder()).distinct().count();
		System.out.println(count);
	}

}
