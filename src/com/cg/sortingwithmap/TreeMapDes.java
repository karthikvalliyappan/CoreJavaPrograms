package com.cg.sortingwithmap;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDes
{
    public static void main(String[] args)
    {
        Map<Character, Integer> map = new TreeMap<>(Collections.reverseOrder()); // Descending order by keys
        map.put('g',1);
        map.put('e',3);
        map.put('a',1);
        map.put('s',2);
        System.out.println(map);
    }
}
