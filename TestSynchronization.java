package com.simplilearn.synchronization;

public class TestSynchronization {
	
	public static void main(String[] args) {
		
		Sender sender=new Sender();
		
		User supriya= new User("Supriya", "Hello Good morning...!", sender);
		
		User ravi= new User("Ravi","Hello A very Good Morning to all of you...", sender);
		
		supriya.start();
		ravi.start();
	}
}
