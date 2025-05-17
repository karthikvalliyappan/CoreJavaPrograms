package com.cg.merging;

import java.util.Arrays;

public class MergeArrays
{
    public static void main(String[] args)
    {
        int a[] = {1,2,3};
        int b[] = {4,5,6};
        int c[] = new int[a.length+b.length];
        int index = 0;
        for(int data : a)
        {
         c[index] = data;
         index++;
        }
        for(int data : b)
        {
            c[index] = data;
            index++;
        }
        System.out.println(Arrays.toString(c));
    }
}
