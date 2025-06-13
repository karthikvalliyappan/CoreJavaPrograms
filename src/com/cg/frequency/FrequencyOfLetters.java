package com.cg.frequency;

import java.util.*;
import java.util.Map.*;

public class FrequencyOfLetters
{
    public static void main(String[] args)
    {
        String s = "aabbbccdde";  // a2b3c2d2e1

        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char data : s.toCharArray())
        {
            if(map.get(data)==null)
            {
                map.put(data,1);
            }
            else
            {
                map.put(data,map.get(data)+1);
            }
        }
        for(Entry<Character,Integer> data : map.entrySet())
        {
            System.out.print(data.getKey()+""+data.getValue());
            //System.out.print(data.getValue());
        }
    }
}
