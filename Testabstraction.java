package com.simplilearn.abstraction;

public class Testabstraction {
	
	public static void main(String[] args) {

		Shape s1= new Circle(1.5, "Red");
		Shape s2= new Rectangle(2, 4, "Blue");

		System.out.println(s1);
		System.out.println(s2);

	}
}
