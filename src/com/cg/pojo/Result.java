package com.cg.pojo;

public class Result
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.setRollNumber(123);
        student.setSection("A");
        System.out.println(student.getRollNumber());
        System.out.println(student.getSection());
        System.out.println(student);
    }
}
