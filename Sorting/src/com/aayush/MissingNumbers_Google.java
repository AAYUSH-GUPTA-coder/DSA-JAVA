package com.aayush;
//LEETCODE 448. Find All Numbers Disappeared in an Array

//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that
// do not appear in nums.
//
//
//
//        Example 1:
//
//        Input: nums = [4,3,2,7,8,2,3,1]
//        Output: [5,6]
//        Example 2:
//
//        Input: nums = [1,1]
//        Output: [2]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumbers_Google {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(Numbers(nums));
    }

    static List<Integer> Numbers(int[] arr){
        List<Integer> numbers = new ArrayList<>();
        int i=0;
        while(i < arr.length ){
            int correctIndex = arr[i] -1;
            if(i < arr.length && arr[i] != arr[correctIndex]){
                swap(i,correctIndex,arr);
            }else{
                i++;
            }
        }
        // finding missing numbers
        for(int index = 0;index < arr.length ;index++){
            if(arr[index] != index+1){
                numbers.add(index+1);
            }
        }
        return numbers;
    }

    static void swap(int a,int b , int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
