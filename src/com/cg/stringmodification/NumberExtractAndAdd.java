package com.cg.stringmodification;

public class NumberExtractAndAdd
{
    public static void main(String[] args)
    {
        String s = "heelow123s@3#";
        int sum = 0;

        for(char data : s.toCharArray())
        {
            if(data >= '0' && data <='9')  // character should be in quotes  // Character.isDigit(data)
            {
                System.out.println(data);
                sum = sum + Character.getNumericValue(data);
            }
        }
        System.out.println("Sum : "+ sum);
    }
}
