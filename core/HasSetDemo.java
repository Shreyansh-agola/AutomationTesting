package com.core;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetDemo {
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(10.10);
		hs.add("Tops");
		hs.add('t');
		hs.add(null);
		hs.add(100);
		hs.add(true);
		hs.add(10);
		//has not allow duplicate
		
		System.out.println(hs);
		
		Iterator op=hs.iterator();
		while(op.hasNext())
		{
			System.out.println(op.next());
		}
	}

}
