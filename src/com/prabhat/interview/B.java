package com.prabhat.interview;
public class B extends A
{
    
    public String f()
    {
        return "B";
    }

    public static void main(String[] args)
    {
        B b = new B();
        A a = (A) b;
        System.out.println(b.f()); //prints: B
        System.out.println(a.f());
    }
}