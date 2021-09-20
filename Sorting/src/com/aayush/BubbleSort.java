package com.aayush;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Bubble(int[] arr){
        // to make bubble sort more efficient
        // to break the loop only after first loop
        boolean swapped = false;
        for(int i=0;i<arr.length;i++){
            for(int j = 1 ; j< arr.length-i;j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
