package com.cg.comman;

import java.util.HashSet;
import java.util.Set;

public class Intersection
{
    public static void main(String[] args)
    {
        Set<String> setOne = new HashSet<>(Set.of("chennai","mumbai", "banglore"));
        Set<String> setTwo = new HashSet<>(Set.of("hyderabad","chennai", "banglore"));


        // Intersection
        Set<String> commonData = new HashSet<>(setOne);
        commonData.retainAll(setTwo);
        System.out.println("Common Data: " + commonData);

    }
}
