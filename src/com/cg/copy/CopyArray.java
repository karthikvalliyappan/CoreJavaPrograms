package com.cg.copy;

import java.util.Arrays;

public class CopyArray
{
    public static void main(String[] args)
    {
        int a[] = {1,2,5,6,7};
        int b[] = new int[a.length];
        int index=0;
        for(int data : a)
        {
            b[index] = data;
            index++;
        }
        System.out.println(Arrays.toString(b));

        // another method
        int c[] = a.clone();
        System.out.println(Arrays.toString(c));
    }
}
