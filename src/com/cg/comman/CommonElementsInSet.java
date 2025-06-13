package com.cg.comman;

import java.util.*;

public class CommonElementsInSet
{
    public static void main(String[] args)
    {
        Set<String> setOne = new HashSet<>(Set.of("chennai","mumbai", "banglore"));
        Set<String> setTwo = new HashSet<>(Set.of("hyderabad","chennai", "banglore"));

        Set<String>  commonData = new HashSet<>();
        Set<String>  differentData = new HashSet<>();

        int count = 0;
        for(String data : setOne)
        {
                if(setTwo.contains(data))
                {
                    commonData.add(data);
                }
                else
                {
                    differentData.add(data);
                }
        }

        for (String data : setTwo)
        {
            if(!setOne.contains(data))
            {
                differentData.add(data);
            }
        }
        System.out.println(commonData);
        System.out.println(differentData);
    }
}
