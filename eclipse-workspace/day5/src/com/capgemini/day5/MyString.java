package com.capgemini.day5;

public class MyString {
	
	public static void main(String[] args) {
		
    String str="hello";		
	String str1=new String("hello");
	String str2="hello word";
	
	//equal
	if(str.equals(str1))
	{
		System.out.println("true");
	} 
	else 
	{
		System.out.println("false");
	}
	
	//compare
	String one="A";
	String two="B";
	System.out.println(one.compareTo(two));
	System.out.println(two.compareTo(str2));
	
	//char
	str.charAt(0);
	System.out.println(str.charAt(0));
	
	//Concatenation
	System.out.println(str.concat(str1));
	System.out.println(str1.concat(str2));
	System.out.println(str.concat(str2));
	
	//string to byte array
	byte[] b=str.getBytes();
	System.out.println(str.indexOf("e"));
	
    String str4="";
    System.out.println(str4.isBlank());
    
    //length
    System.out.println(str.length());
    
    //new and old replace with new value
    str.replace("H", "j");
    System.out.println(str.replace("H", "j"));
    
    //character sequence
    System.out.println(str.subSequence(0, 3));
    
    //to upper case
    String str5="java";
    System.out.println(str5.toString());
    System.out.println(str.toUpperCase());
    
    // to lower case
    String str6="JAVA";
    System.out.println(str6.toLowerCase());
    System.out.println(str.toLowerCase());
    
    // remove the space front and back
    String str7="     hello      world   ";
    System.out.println(str7.trim());
    System.out.println(str7);
    
    String str8=" h e e l l o ";
    System.out.println(str8.trim());
    
    System.out.println(str.subSequence(0, 3));
	
	}
}
