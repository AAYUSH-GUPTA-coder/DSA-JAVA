package com.aayush;
//LEETCODE 41. First Missing Positive

//Given an unsorted integer array nums, return the smallest missing positive integer.
//
//        You must implement an algorithm that runs in O(n) time and uses constant extra space.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,0]
//        Output: 3
//        Example 2:
//
//        Input: nums = [3,4,-1,1]
//                       [1,-1,3,4]
//        Output: 2

public class FirstMissingPositiveNum_Amazon {
    public static void main(String[] args) {
        int arr[] = {7,8,9,11,12};
        System.out.println(Missing(arr));
    }

    static int Missing(int[] arr){
        int i=0;
        while(i< arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                swap(i,correctIndex,arr);
            }else{
                i++;
            }
        }
        for(int index = 0 ; index < arr.length; index++){
            if(arr[index] != index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }

    static void swap(int a,int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
