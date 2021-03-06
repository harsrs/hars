package com.capgemini.day7;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        TreeMap<String, Integer> map1 = new TreeMap<String, Integer>();
  
         map1.put("abc", 1001);
    
         TreeMap<Integer, Student1> map2 = new TreeMap<Integer, Student1>();
    
         map2.put(1001, new Student1(1001,"abc","1000"));
         map2.put(1001, new Student1(1001,"abc","1000"));
         map2.put(1001, new Student1(1001,"abc","1000"));
         map2.put(1001, new Student1(1001,"abc","1000"));
         map2.put(1001, new Student1(1001,"abc","1000"));
       
         TreeMap<Student1, Student1> map3 = new TreeMap<Student1, Student1>();

         TreeMap<Student1, Integer> map4 = new TreeMap<Student1, Integer>();

         TreeMap<Student1, String> map5 = new TreeMap<Student1, String>();
         map5.put(null, null);
         
         map5.pollFirstEntry();
         map.pollLastEntry();
         
         map5.descendingKeySet();
         
         map5.firstKey();
         map5.lastKey();
         
        map.put(1001, "harshitha");
        map.put(1002, "priya");
        map.put(1003, "komal");
        map.put(1004, "kumar");
        map.put(1004, "kumar1");

       
        Set<Integer> keys = map.keySet();

        for(Integer key : keys)
        {
        	System.out.println("key " + key + " value " + map.get(key));
        }
        map.clear();
        map.containsKey(keys);
        

        System.out.println(map.containsValue("harshitha"));
        
        Set<Map.Entry<Integer, String>> key = map.entrySet();
        
        for(Map.Entry<Integer, String> m:key)
        {
        	System.out.println(m.getKey() + "Value is" +m.getValue());
        }
         
        map.isEmpty();
 
        map.size();
        
        Collection<String> value=map.values();
        value.forEach(System.out::println);
	         
	}
	  
}
