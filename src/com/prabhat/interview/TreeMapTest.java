package com.prabhat.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		/*Map<Integer, String> map=new TreeMap<>();
		map.put(11, "a");
		map.put(12, null);
		map.put(null, null);
		map.put(32, null);*/
		//System.out.println(map.size());
		//System.out.println(map);

		/*Set<String> set1=new TreeSet<>();
		set1.add(null);
		//set.add("abc");
		System.out.println(set1);*/
		

		

		/*Iterator i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			// set.add(5);
			i.remove();
		}*/
	//	System.out.println(set);
		/*Map<String, Integer> map1=new HashMap<>();
		map1.put("a", 12);
		map1.put("b", 13);
		map1.put(null, 13);
		map1.put(null, 14);

		
		System.out.println(map1);*/
		
		Employee emp1=new Employee("Santosh");
		Employee emp2=new Employee("Prabhat");
		Employee emp3=new Employee("Manav");
		
		List<Employee> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		
		/* String s1="santosh";
		String s2="prabhat";
		String s3="Manav";
		List<String> list1=new ArrayList<>();*/
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
