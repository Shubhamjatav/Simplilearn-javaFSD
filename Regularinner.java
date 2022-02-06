package com.simplilearn.inner;

public class RegularInner {
	
	public int = 20;
	private String b= "Welcome";
	
	class Inner
	{
		public void Display()
		{
			System.out.println("Value of a "+a);
			System.out.println("Value of b "+b);
			
		}
	}
     public static void main(String[]args) {
    	 RegularInner outer=new RegularInner();
    	 RegularInner.Inner inner=outer.new Inner();
    	 
    	 inner.display();
     }
}
