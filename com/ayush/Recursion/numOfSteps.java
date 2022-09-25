package com.ayush.Recursion;

public class numOfSteps {
    public static void main(String[] args) {
        System.out.println(helper(41, 0));
        
        
    }
    // public int numberofsteps(int num){
    //     return helper(num, 0);
        
    // }
    private static int helper(int num, int steps){

        if(num == 0){
            return steps;
        }
        if (num % 2 ==0){
            return helper(num /2, steps+1);

        }
        else{
            return helper(num -1, steps +1);
        }
    }
}
