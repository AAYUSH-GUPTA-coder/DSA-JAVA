package com.aayush;
//LEETCODE 268. Missing Number

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//
//        Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
//
//
//
//        Example 1:
//
//        Input: nums = [3,0,1]
//        Output: 2
//        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since
//        it does not appear in nums.

//        Example 2:
//
//        Input: nums = [0,1]
//        Output: 2
//        Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range
//        since it does not appear in nums.

public class MissingNumber_Amazon {
    public static void main(String[] args) {
        int[] arr = {0,1,3,4};
        System.out.println(Number(arr));
    }

    static int Number(int[] arr){
        int i=0;
        while(i < arr.length){
            int correctIndex  = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(i,correctIndex,arr);
            }else{
                i++;
            }
        }
        // search to find first Missing Number
        for(int index = 0 ; index < arr.length; index++){
           if(arr[index] != index){
               return index;
           }
        }
        // case 2 return last element
        return arr.length;
    }

    static void swap(int a , int b , int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
