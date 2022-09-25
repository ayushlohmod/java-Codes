package com.ayush.Recursion;

public class Recursion {
    public static void main(String[] args) {
        

        funboth(5);
         
    }

    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void Revfun(int n){
        if(n == 0){
            return;
        }
        Revfun(n-1);
        System.out.println(n);
    }
    static void funboth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        funboth(n-1);

        
        System.out.println(n);
    }
}
