package com.cg.replace;

import java.util.*;

public class CollectionItems
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(8);
        list.set(0,9);
        System.out.println(list);

        Set<Integer> set = new LinkedHashSet<>();
        set.add(3);
        set.add(1);
        set.add(8);
        if(set.remove(3))
        {
            set.add(9);
        }
        System.out.println(set);

        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "John");
        map.put("city", "London");
        map.replace("city", "Paris");  // replaces "London" with "Paris"
        System.out.println(map);
    }
}
