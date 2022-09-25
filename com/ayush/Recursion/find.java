package com.ayush.Recursion;

public class find {
    
    public static void main(String[] args) {

        int [] arr = {2,3,4,1,4,5};

        System.out.println(Findlast(arr, 3,arr.length-1));
        
    }
    static boolean Find(int[] arr, int target, int index){
        // if you are very end of an array
        if(index == arr.length ){
            return false;

        }
        return arr[index] == target || Find(arr, target, index +1);
    }

    static int Findindex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return Findindex(arr, target, index+1);
        } 
    }
    static int Findlast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return Findlast(arr, target, index-1);
        } 
}
}
