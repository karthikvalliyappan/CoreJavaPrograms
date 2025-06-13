package com.cg.reversemap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;

public class ReverseIndividualWords
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
        for(int i=0; i<map.size();i++)
        {
            for(int j=map.get(i).length()-1; j>=0;j--)
            {
                System.out.print(map.get(i).charAt(j));
            }
            System.out.print(" ");
        }

        System.out.println();

        // another method

        for(Map.Entry<Integer,String > data : map.entrySet())
        {
            for(int i = data.getValue().length()-1; i>=0;i--)
            {
                System.out.print(data.getValue().charAt(i));
            }
            System.out.print(" ");
        }
    }

}
