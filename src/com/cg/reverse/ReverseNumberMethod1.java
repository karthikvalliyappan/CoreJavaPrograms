package com.cg.reverse;

public class ReverseNumberMethod1
{
    public static void main(String[] args)
    {
        int num = 364;
        String s = String.valueOf(num);
        String temp = "";
        for(int i = s.length()-1; i>=0; i--)
        {
            //System.out.print(s.charAt(i));
            temp = temp + s.charAt(i);
        }
        int reverseNum = Integer.parseInt(temp);
        System.out.println(reverseNum);
    }
}
