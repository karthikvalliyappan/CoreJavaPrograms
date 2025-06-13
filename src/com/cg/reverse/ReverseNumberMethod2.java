package com.cg.reverse;

public class ReverseNumberMethod2
{
    public static void main(String[] args)
    {
        int num = 364;
        while (num!=0)
        {
            int rem = num%10;
            System.out.print(rem);
            num = num/10;
        }
    }
}
