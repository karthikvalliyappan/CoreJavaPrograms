package com.cg.overriding;

public class Banana extends Apple
{
    public  void eat (int a)
    {
        System.out.println("Eat Banana");
    }

    public static void main(String[] args)
    {
        Apple obj = new Banana();
        obj.eat(5);
    }
}

