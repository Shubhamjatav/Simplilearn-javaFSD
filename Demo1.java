package com.simplilearn.uncheckedexception;

import java.util.Scanner;

//runtime: Arithmetic Exception
public class Demo1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int div=num1/num2;
		
		System.out.println("Division is "+div);
		System.out.println("End of the program");
	}
	}
