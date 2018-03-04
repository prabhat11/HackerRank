package com.prabhat.interview;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
private String name;
	
	public Employee(String name) {
		this.name=name;
	}
	
	/*@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}*/
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		return this.name.compareTo(o.name);
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name;
		}
	

}
