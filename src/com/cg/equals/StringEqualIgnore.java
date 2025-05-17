package com.cg.equals;

public class StringEqualIgnore
{
    public static void main(String[] args)
    {
        String s1 = "peek";
        String s2 = "PeeK";
        int count=0;

        if(s1.length()==s2.length())
        {
            for(int i = 0; i <s1.length(); i++)
            {
                if(Character.toLowerCase(s1.charAt(i)) == Character.toLowerCase(s2.charAt(i)))
                {
                    count++;
                }
            }
            System.out.println((count==s1.length())?"Equals" : "Not Equals");
        }
        else
        {
            System.out.println("Both Strings are not equal");
        }
    }
}
