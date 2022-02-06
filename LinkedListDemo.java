package com.simplilearn.collection;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		System.out.println("Size: "+list.size());
		list.add(56);
		list.add(67);
		list.add(89);
		list.add(13);
		
		System.out.println("Size: "+list.size());
		System.out.println(list);
		
		list.remove(3);
		System.out.println("element 2"+list.get(2));
		list.add(2, 0);
		System.out.println(list);
		System.out.println("first element "+list.getFirst());
		System.out.println("last element "+list.getLast());
		
		//for each loop
		for(String s:list)
		{
			System.out.println(s);
		}
		
		//iterate using iterate
		Iterator<String> itr=list.Iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
