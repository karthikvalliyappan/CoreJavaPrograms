package com.cg.comman;

import java.util.*;

public class CommonElements
{
    public static void main(String[] args)
    {
        List<Integer> listOne = new ArrayList<>(List.of(2,3,2,5,6,7,8));
        List<Integer> listTwo = new ArrayList<>(List.of(2,2,2,9,10,11,12,8));
        int count = 1;
        for(int i = 0; i<listOne.size(); i++)
        {
            for(int j = 0; j<listTwo.size(); j++)
            {
                if(listOne.get(i)==listTwo.get(j))
                {
                    listTwo.set(j,99);
                    count++;
                }
            }
            if(count>=2)
            {
                System.out.println(listOne.get(i));
            }
            count=1;
        }
    }
}
