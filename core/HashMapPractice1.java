package com.core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMapPractice1 {
	public static void main(String[] args) {
		
		HashMap has=new HashMap();
		has.put(1, "shrey");
		has.put(2, "megha");
		has.put(3, "vijay");
		
		System.out.println(has);
		
		Set s=has.entrySet();
		Iterator or=s.iterator();
		
		while(or.hasNext())
		{
			System.out.println(or.next());
		}
		
	}

}
