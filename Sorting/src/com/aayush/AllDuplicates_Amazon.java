package com.aayush;
// LEETCODE 442. Find All Duplicates in an Array

//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice,
// return an array of all the integers that appears twice.
//
//        You must write an algorithm that runs in O(n) time and uses only constant extra space.
//
//
//
//        Example 1:
//
//        Input: nums = [4,3,2,7,8,2,3,1]
//        Output: [2,3]
//        Example 2:
//
//        Input: nums = [1,1,2]
//        Output: [1]

import java.util.ArrayList;
import java.util.List;

public class AllDuplicates_Amazon {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
                    //{1,2,3,4,2,3,7,8}
        System.out.println(Numbers(nums));
    }

    static List<Integer> Numbers(int[] arr){
        List<Integer> num = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(i , correctIndex,arr);
            }else{
                i++;
            }
        }
        for(int index=0 ; index <arr.length ; index++){
            if(arr[index] != index+1){
                num.add(arr[index]);
            }
        }
        return num;
    }

    static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
