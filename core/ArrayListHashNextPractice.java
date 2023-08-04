package com.core;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListHashNextPractice {
	public static void main(String[] args) {
		
		ArrayList alh=new ArrayList();
		
		alh.add(10);
		alh.add("hi");
		alh.add(true);
		alh.add('2');
		alh.add(10.20);
		alh.add(null);
		
		System.out.println(alh);
		
		Iterator aln=alh.iterator();
		while(aln.hasNext())
		{
			System.out.println(aln.next());
		}
		
		
	}

}
