package com.cg.stringmodification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ZeroesNumber
{
    public static void main(String[] args)
    {
        int a[] = { 1, 2,3,0,1,4,0,3,2,0};
        LinkedList<Integer> list = new LinkedList<>();
        for(int num : a)
        {
            if(num!=0)
            {
                list.addFirst(num);
            }
            else
            {
                list.addLast(num);
            }
        }
        System.out.println(list);
    }
}
