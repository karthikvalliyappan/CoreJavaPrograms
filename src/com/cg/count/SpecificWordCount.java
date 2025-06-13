package com.cg.count;

public class SpecificWordCount
{
    public static void main(String[] args)
    {
        String s = "hello how are you are are";
        int count = 0;
        for(String data : s.split(" "))
        {
            if(data.equals("are"))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
