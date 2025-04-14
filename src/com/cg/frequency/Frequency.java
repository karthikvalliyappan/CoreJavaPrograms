package com.cg.frequency;
import java.util.*;
import java.util.Map.*;
public class Frequency
{
    public static void main(String[] args)
    {
        String s = "hello how are you?";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char data :  s.toCharArray())
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
        System.out.println(map);
        System.out.println("Frequency Of Characters excluding space");
        for(Entry<Character,Integer> data : map.entrySet())
        {
            if(data.getKey()!= ' ')
            {
                System.out.println(data.getKey() + " = "+ data.getValue());
            }
        }
    }
}
