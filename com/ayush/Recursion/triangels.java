package com.ayush.Recursion;


import java.util.Arrays;

public class triangels {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        //bubble(arr, 0, arr.length-1);
        selction(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Traingles(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            Traingles(r, c+1);
        }else{
            System.out.println();
            Traingles(r-1, 0);
        }
    }
    static void bubble(int[] arr,int c , int r){
        if(r == 0){
            return;
        }
        if(c < r){
            
            if(arr[c] > arr[c +1]){
                //swip
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;

            }
            bubble(arr, c+1, r);

        }else{
            bubble(arr, 0, r-1);
        }

    }
    static void selction(int[] arr,int r , int c, int max){
        if(r == 0){
            return;
        }
        if(c < r){
            
            if(arr[c] > arr[max]){
                //swip
                selction(arr, r, c+1, c);  
            }else{
            selction(arr, r, c+1, max);
            }
        }else{
            //swap
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selction(arr, r-1, 0, 0);
        }

    }
}
 
