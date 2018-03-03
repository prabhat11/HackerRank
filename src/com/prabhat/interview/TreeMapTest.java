package com.prabhat.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapTest {
	public static void main(String[] args) {
		Set set = new HashSet<>();
		set.add("1");
		set.add(1);
		set.add(null);
		set.add("null");
		
	/*	
		Map<Integer, Integer> map=new TreeMap<>();
		map.put(10, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(21, null);
		map.put(22, null);
		
		System.out.println(map);*/
		Map<Integer, String> map=new TreeMap<>();
		map.put(11, "a");
		map.put(12, null);
		map.put(13, null);
		//map.put(null, null);
		System.out.println(map.size());
		System.out.println(map);


		

		/*Iterator i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			// set.add(5);
			i.remove();
		}*/
	//	System.out.println(set);
	}

}
