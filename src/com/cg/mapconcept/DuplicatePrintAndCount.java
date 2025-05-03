package com.cg.mapconcept;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicatePrintAndCount
{
    public static void main(String[] args)
    {
        String s = "hello how are you";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char data : s.toCharArray())
        {
            if(map.get(data)==null)
            {
                map.put(data,1);
            }
            else
            {
                map.put(data, map.get(data)+1);
            }
        }
        for(Map.Entry<Character,Integer> data : map.entrySet())
        {
            if(data.getValue()>=2 && data.getKey()!=' ')
            {
                System.out.println(data.getKey() +"=="+ data.getValue());
            }
        }
    }
}
