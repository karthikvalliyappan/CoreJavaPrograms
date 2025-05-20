package com.cg.sortinglist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ascending
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(8);
        Collections.sort(list);
        System.out.println(list);
    }
}
