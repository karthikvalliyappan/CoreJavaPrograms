package com.cg.customexception;

public class App
{
    public static void main(String[] args) throws AppDownException
    {
        throw new AppDownException();
    }
}
