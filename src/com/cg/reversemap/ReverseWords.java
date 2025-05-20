package com.cg.reversemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReverseWords
{
    public static void main(String[] args)
    {
        String s = "hello how are you";
        String [] s1 = s.split(" ");
        Map<Integer, String> map = new HashMap<>();
        for(int i = 0; i<s1.length;i++)
        {
            map.put(i,s1[i]);
        }
        for(int i = map.size()-1; i>=0; i--)
        {
            System.out.print(map.get(i) +" ");
        }
    }
}
