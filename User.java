package com.simplilearn.synchronization;

public class User extends Thread{
	
	String name;
	String msg;
	Sender sender;
	
	public User(String name,String msg,Sender sender) {
	
		this.name=name;
		this.msg=msg;
		this.sender=sender;
	}
	
	public void run()
	{
		System.out.println(name +" want to send a massage "+msg);
		
		synchronized(sender)
		{
			sender.send(msg);
		}
	}
}
