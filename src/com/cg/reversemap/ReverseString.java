package com.cg.reversemap;

import java.util.HashMap;
import java.util.Map;

public class ReverseString
{
    public static void main(String[] args)
    {
        String s = "hello how are you";
        Map<Integer, Character> map = new HashMap<>();
        for(int i = 0; i<s.length();i++)
        {
            map.put(i,s.charAt(i));
        }
        for(int i = s.length()-1; i>=0;i--)
        {
            System.out.print(map.get(i));
        }
    }
}
