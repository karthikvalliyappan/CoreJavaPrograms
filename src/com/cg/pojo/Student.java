package com.cg.pojo;

public class Student
{
    int rollNumber;
    String section;

    public int getRollNumber()
    {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber)
    {
        this.rollNumber = rollNumber;
    }

    public String getSection()
    {
        return section;
    }
    public void setSection(String section)
    {
        this.section = section;
    }

    @Override
    public String toString()
    {
        return "Roll Number: "+rollNumber+"\nSection: "+section;
    }
}
