package com.cg.equals;

public class Anagram
{
    public static void main(String[] args)
    {
        String s1 = "peek";
        String s2 = "keep";
        char [] c1 = s1.toCharArray();
        char [] c2 = s2.toCharArray();
        int count = 0;
        if(c1.length==c2.length)
        {
            for(int i = 0; i<c1.length;i++)
            {
                for(int j = 0; j<c2.length; j++)
                {
                    if(c1[i]==c2[j])
                    {
                        count++;
                        c2[j]= '0';    // important
                        break;
                    }
                }
            }
            System.out.println((c1.length==count)? "Anagram" : "Not Anagram");
        }
        else
        {
            System.out.println("Not An Anagram");
        }
    }
}
