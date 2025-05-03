package com.cg.mapconcept;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        String s = "hello how are you";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char data : s.toCharArray())
        {
            if (map.get(data) == null)
            {
                map.put(data, 1);
                System.out.print(data);
            }
        }
    }
}