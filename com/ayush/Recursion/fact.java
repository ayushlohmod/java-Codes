package com.ayush.Recursion;

public class fact {
    public static void main(String[] args) {

        int ans = fact1(5);
        System.out.println(ans);
        
    }

    static int fact1(int n){

        if(n <= 1){
            return 1;
        }

        return n * fact1(n -1);
    }
}
