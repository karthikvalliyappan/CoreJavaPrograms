package com.cg.numberoperations;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        int c = 0;
        int count = 1;
        while(count<=10)
        {
            System.out.println("count " + count + " ==> " +a);
            c = a+b;
            a=b;
            b=c;
            count++;
        }
    }
}
