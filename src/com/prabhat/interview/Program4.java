package com.prabhat.interview;

import java.util.HashMap;

public class Program4 {

	public static void main(String[] args) {
		HashMap<Employee, String> hm=new HashMap<Employee,String>();
		hm.put(new Employee("a"), "emp1");
		hm.put(new Employee("b"), "emp2");
		hm.put(new Employee("a"), "emp1 overridden");
		
		System.out.println(hm.size());
		System.out.println(hm.get(new Employee("a")));
	}

}
