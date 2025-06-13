package com.cg.count;

public class WordCount
{
    public static void main(String[] args)
    {
        String s = "an apple day";
        int wordCount = 0;
        if(s.length()>=2)
        {
            for (int i = 0; i < s.length(); i++)
            {
                if (i != s.length()-1 && s.charAt(i) != ' ' && s.charAt(i + 1) == ' ')
                {
                    wordCount++;
                }
            }
            System.out.println("Number of words: " + (wordCount+1));
        }
        else
        {
            System.out.println("No words");
        }
    }
}
