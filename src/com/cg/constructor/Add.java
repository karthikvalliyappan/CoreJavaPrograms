package com.cg.constructor;

public class Add
{
    int a;
    int b;
    public Add(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public static void main(String[] args)
    {
        Add add = new Add(5,4);

        System.out.println(add.a+add.b);
    }
}
