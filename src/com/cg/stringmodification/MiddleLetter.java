package com.cg.stringmodification;

public class MiddleLetter
{
    public static void main(String[] args)
    {
        String s = "aaabccc";
        if(s.length()%2 != 0)
        {
            System.out.println("Middle Letter: " + s.charAt(s.length()/2));
        }
        else
        {
            System.out.println("Can not find the middle letter");
        }
    }
}
