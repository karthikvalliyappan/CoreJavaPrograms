package com.cg.sortingwithmap;

import java.util.*;

public class DescendingSortByValue
{
    public static void main(String[] args)
    {
        Map<Character, Integer> map = new HashMap<>();
        map.put('g',1);
        map.put('e',3);
        map.put('a',1);
        map.put('s',2);

        Set<Map.Entry<Character,Integer>> entrysetData = map.entrySet();
        List<Map.Entry<Character,Integer>> list = new LinkedList<>(entrysetData);
        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        //list.sort(Collections.reverseOrder(Map.Entry.comparingByKey()));

        Map<Character,Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> data : list)
        {
            sortedMap.put(data.getKey(), data.getValue());
        }
        System.out.println("Sorted Map:" + sortedMap);
    }
}
