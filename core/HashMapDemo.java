package com.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap map=new HashMap();
		//HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(901, "shreyansh");
		map.put(902, "mrinal");
		map.put(903, "vijay");
		map.put(904, "megha");
		map.put(905, "jigar");
		map.put(901, "shreyansh");
		
		System.out.println(map);
		
		Set s=map.entrySet();
		//entery set su kare to key and value no eek set banavi de 
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
