package com.cg.comman;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.*;

public class SymmetricDataInList
{
    public static void main(String[] args)
    {
        List<String> listOne = new ArrayList<>(List.of("chennai","mumbai", "banglore"));
        List<String> listTwo = new ArrayList<>(List.of("hyderabad","chennai", "banglore"));

        List<String> commonData = new ArrayList<>(listOne);
        commonData.retainAll(listTwo);

        // Intersection
        List<String> differentData = new ArrayList<>(listOne);
        differentData.addAll(listTwo);
        differentData.removeAll(commonData);
        System.out.println("Different Data: " + differentData);
    }
}
