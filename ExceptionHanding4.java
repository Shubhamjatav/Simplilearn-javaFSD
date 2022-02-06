
package com.simplilearn.exceptionhandling;

public class ExceptionHanding4 {
	
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			try
			{
				//risky code
				sum= sum + Integer.parseInt(args[i]);
			}
			catch(Exception e)
			{
				System.out.println("Exception Occured"+e);
			}
		}
	    System.out.println("Sum is "+sum);
	}
}
