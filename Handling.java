package com.simplilearn.exceptionhandling;

public class Handling {
	
	static void waitFor()
	{
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		waitFor();
	}
}
