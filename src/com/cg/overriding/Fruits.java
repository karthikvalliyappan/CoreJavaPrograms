package com.cg.overriding;

import com.cg.customexception.App;

public class Fruits extends Banana
{
    public static void main(String[] args)
    {
        Apple apple = new Fruits();
        apple.eat(5);
    }
}
