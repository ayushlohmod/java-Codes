package com.ayush.Recursion;

public class digits {
    public static void main(String[] args) {
        int ans = digit(1342);

        System.out.println(ans);
        
    }
    static int digit (int n){

        //base condition
        if(n == 0){
            return 0;
        }

        return (n%10) + digit(n/ 10);
    }
}
