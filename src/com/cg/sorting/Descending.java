package com.cg.sorting;

import java.util.Arrays;

public class Descending
{
    public static void main(String[] args)
    {
        int[] a= {2,1,3,5,9,6};
        int temp;
        for (int i = 0; i<a.length; i++)
        {
            for (int j = i+1; j<a.length; j++)
            {
                if(a[i]<a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
