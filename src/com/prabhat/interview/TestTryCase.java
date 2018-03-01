package com.prabhat.interview;

/**
 * 
 * @author Prabhat
 *
 */
public class TestTryCase {

	public static void main(String[] args) {

		TestTryCase t = new TestTryCase();
		System.out.println(t.getNum());
	}

	public int getNum() {
		try {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
}
