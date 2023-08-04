package com.core;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.10);
		al.add("tops");
		al.add('t');
		al.add(true);
		al.add(null);
		al.add(10);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(3));
		System.out.println(al.isEmpty());
		al.remove(4);
		System.out.println(al);
		al.set(2, 100);
		//replace 2 index with 100
		System.out.println(al);
		
		//iterator is an interface so we can not create its object
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//hesnext method is a boleain method to check array data stored in itr object or not.
			//next() method is for line by line print array element
		}
	}

}
