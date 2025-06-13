package com.cg.mapconcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FetchValuesFromMap
{
    public static void main(String[] args)
    {
        Map<Character, Integer> map = new HashMap<>(Map.of('a',1,'e',4,'s',7));

        System.out.println("Values are listed below: ");

        for (Map.Entry<Character,Integer> data : map.entrySet())
        {
            //System.out.println(map.get(data.getKey()));
            System.out.println(data.getValue());
        }

        System.out.println("Values are listed below: ");
        // Another method

        for(char key : map.keySet())
        {
            System.out.println(map.get(key));
        }
    }
}
