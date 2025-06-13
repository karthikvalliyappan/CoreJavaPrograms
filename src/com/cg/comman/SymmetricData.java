package com.cg.comman;

import java.util.HashSet;
import java.util.Set;

public class SymmetricData
{
    public static void main(String[] args)
    {
        Set<String> setOne = new HashSet<>(Set.of("chennai","mumbai", "banglore"));
        Set<String> setTwo = new HashSet<>(Set.of("hyderabad","chennai", "banglore"));

        //Intersection
       Set<String> commonData = new HashSet<>(setOne);
        commonData.retainAll(setTwo);

        Set<String> differentData = new HashSet<>(setOne);
        differentData.addAll(setTwo);
       differentData.removeAll(commonData);
        System.out.println("Different Data: " + differentData);
        //setOne.addAll(setTwo);
       // setOne.removeAll(setTwo);
        //System.out.println(setOne);
    }
}
