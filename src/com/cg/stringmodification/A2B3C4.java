package com.cg.stringmodification;

public class A2B3C4
{
    public static void main(String[] args)
    {
        String s = "a2b3c5";
        for(int i = 0; i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int index = Character.getNumericValue(s.charAt(i));

                for(int j = 1; j<=index; j++)
                {
                    System.out.print(s.charAt(i-1));
                }
            }
        }
    }

}
