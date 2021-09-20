package com.aayush;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,-1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static void swap(int[] arr, int first,int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start,int end){
        int max = start;
        for(int i=start; i<=end ; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
