package com.ayush.oops;

import java.util.Arrays;

public class classes {
    public static void main(String[] args) {

        Student [] students = new Student[5];
        
        Student ayush = new Student();

        ayush.rno = 04;
        ayush.name = "ayush lohmod";
        ayush.marks = 75.5f;

        System.out.println(ayush.name);
        System.out.println(ayush.marks);
        System.out.println(ayush.rno);
        
        
    }
}
    class Student{
        int rno;
        String name ;
        float marks;
    }
    

