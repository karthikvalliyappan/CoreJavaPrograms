package com.cg.customexception;

public class AppDownException extends  Exception
{
    public String getMessage()
    {
      return "Application Is Down, please try again later";
    }
}
