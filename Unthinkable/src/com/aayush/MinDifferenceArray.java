package com.aayush;
// Count of all pairs in an Array with minimum absolute difference
import java.util.*;
public class MinDifferenceArray {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 3 };
        int N = arr.length;

        // Function Call
        System.out.println(minDifferencePair(arr,N));
    }

    static int minDifferencePair(int[] arr, int N){
        int count=0;
        Arrays.sort(arr);
        int minimum = 1000000;
        for(int i=0;i<N-1;i++){
            minimum = Math.min(minimum,arr[i+1]-arr[i]);
        }
        for(int j=0;j<N-1;j++){
            if(arr[j+1]-arr[j] == minimum){
                count++;
            }
        }
        return count;
    }
}
