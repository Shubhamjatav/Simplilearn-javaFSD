package com.simplilearn.string;

public class StringDemo {
	
	public static void main(String[] args) {
		
	String s1 = new String("Hello World");
	
	char c = s1.charAt(2);
	System.out.println("character at Index 2 "+c);
	
	System.out.println("Length "+s1.length());
	System.out.println("upper case "+s1.toUpperCase());
	System.out.println("Lower case: "+s1.toLowerCase());
	
	System.out.println("check String contains "+s1.contains("world"));
	System.out.println("Sub String "+s1.substring(6,9));
	String result[]=s1.split(" ");
	
	for(String s:result)
	{
		System.out.println(s);
	}
	
	String s2="Hello World";
	
	if(s1.equals(s2))
		System.out.println("validated");
	else
		System.out.println("Not valid");
	}
}
		

