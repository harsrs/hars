package com.capgemini.day6;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student> Is=new ArrayList<Student>();
		Student s1=new Student(1, "zee","1000");
        Student s2=new Student(3, "kumar","500");
        Student s3=new Student(5, "priya","7000");
        Student s4=new Student(7, "aomal","8000");
        Student s5=new Student(10, "umesh","2000");
        
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);
        ls.add(s5);
        Collections.sort(ls,new SortByID());
        
        for(Student e:ls)
        {​​​​​​
            System.out.println(e);
        }​​​​​​
        
        
        //Sort the user defined data type
	}

}
