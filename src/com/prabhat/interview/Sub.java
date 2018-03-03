package com.prabhat.interview;
public class Sub extends Super {
    static {
        foo = "bar";
    }

    public static void main (String[] args) {
        System.out.println(Super.foo);
    }
}