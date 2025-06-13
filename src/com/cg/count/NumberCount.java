package com.cg.count;

public class NumberCount
{
    public static void main(String[] args)
    {
        int num = 748;
        int count = 0;
        while(num!=0)
        {
            int rem = num%10;
            System.out.println(rem);
            count++;
            num = num/10;
        }
        System.out.println("Count of Numbers are: " + count);
    }
}
