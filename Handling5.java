package com.simplilearn.exceptionhandling;

//throw exception by own
//we can use throw keyword
public class Handling5 {
	
	static void check(int age) throws exception
	{
		if(age<18)
			throw new Exception("Not valid age exception");
		else
			System.out.println("valid user");
	}
	
	public static void main(String[] args) {
		try {
		check(17);
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
