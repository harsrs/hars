package caom.capgemini.day8;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
	
public static void main(String[] args) {
		
		ArrayList<Employee> s=new ArrayList<Employee>();
		Employee s1=new Employee("Harshitha", 9);
		s.add(s1);
		Employee s2=new Employee("Radha", 4);
		s.add(s2);
		
		System.out.println(s);
		
		s.stream().forEach(System.out::println);
		s.stream().filter(e -> e.getId()<0).sorted(Collections.reverseOrder()).forEach(System.out::println);
		
	}

}
