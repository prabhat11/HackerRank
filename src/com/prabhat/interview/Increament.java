package com.prabhat.interview;

/**
 * 
 * @author Prabhat
 *
 */
public class Increament {
	public void preIncreament() {
		int i = 0;
		i++;
		System.out.println(i);
		i = ++i;
		System.out.println(i);

	}

	public static void main(String[] args) {
		Increament t = new Increament();
		t.preIncreament();
	}
}
