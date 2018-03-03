package com.prabhat.interview;




public class TestVariable{
	public static void main(String[] args) {
		Parent p=new child();
		System.out.println(p.i);
	}
	
}

class Parent {
	 int i=10;
	public int getI(){
		return i;
	}

}

class child extends Parent {
	int i=20;
	
}

