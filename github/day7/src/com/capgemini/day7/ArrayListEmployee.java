package com.capgemini.day7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEmployee {
	
	public static void main(String[] args) {
		
		List<Employee> lis=new ArrayList<Employee>();
		Employee s1=new Employee("harshitha", 4112);
		lis.add(s1);
		Employee s2=new Employee("harshitha", 4112);
		lis.add(s2);
		Employee s3=new Employee("harshitha", 4112);
		lis.add(s3);
		Employee s4=new Employee("harshitha", 4112);
		lis.add(s4);
		
		System.out.println(lis);
		
		for(Employee e:lis)
		{
			System.out.println(e);
		}
	}

}
