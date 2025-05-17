package com.cg.count;

public class WordCount
{
    public static void main(String[] args)
    {
        String s = "an apple";
        int wordCount = 1;
        if(s.length()>=2)
        {
            for (int i = 0; i < s.length(); i++)
            {
                if (i != 0 && s.charAt(i) != ' ' && s.charAt(i - 1) == ' ')
                {
                    wordCount++;
                }
            }
            System.out.println("Number of words: " +wordCount);
        }
        else
        {
            System.out.println("No words");
        }
    }
}
