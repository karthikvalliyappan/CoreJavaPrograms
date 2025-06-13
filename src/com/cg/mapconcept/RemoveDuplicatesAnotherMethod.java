package com.cg.mapconcept;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesAnotherMethod
{
    public static void main(String[] args)
    {
        String s = "hello how are you";
        Set<Character> set = new LinkedHashSet<>();
        for(char data : s.toCharArray())
        {
            set.add(data);
        }
        for(char data : set)
        {
            System.out.print(data);
        }
    }
}