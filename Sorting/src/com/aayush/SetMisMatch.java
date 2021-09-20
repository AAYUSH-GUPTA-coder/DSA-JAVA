package com.aayush;
//LEETCODE 645. Set Mismatch

//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error,
// one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
//
//        You are given an integer array nums representing the data status of this set after the error.
//
//        Find the number that occurs twice and the number that is missing and return them in the form of an array.

//Example 1:
//
//        Input: nums = [1,2,2,4]
//        Output: [2,3]
//        Example 2:
//
//        Input: nums = [1,1]
//        Output: [1,2]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(Numbers(arr)));
    }

    static int[] Numbers(int[] arr){
        int i=0;
        while(i < arr.length){
            int correctIndex  = arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                swap(i,correctIndex,arr);
            }else{
                i++;
            }
        }

        for(int index = 0 ; index < arr.length; index++){
            if(arr[index] != index +1 ){
                return new int[] {arr[index] , index+1};
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int a , int b , int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
