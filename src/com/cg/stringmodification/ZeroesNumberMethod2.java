package com.cg.stringmodification;

import java.util.Arrays;
import java.util.LinkedList;

public class ZeroesNumberMethod2
{
    public static void main(String[] args)
    {
        int a[] = { 1,2,3,0,1,4,0,3,2,0}; //  output should be [1, 2, 3, 1, 4, 3, 2, 0, 0, 0]
        int b[] = new int[a.length];
        int sIndex = 0;
        int eIndex = a.length-1;
        for(int num : a)
        {
            if(num!=0)
            {
                b[sIndex] = num;
                sIndex++;
            }
            else
            {
                b[eIndex] = num;
                eIndex--;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
