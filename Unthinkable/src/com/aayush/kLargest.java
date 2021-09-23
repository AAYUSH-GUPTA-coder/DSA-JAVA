package com.aayush;

import java.util.Arrays;

//215. Kth Largest Element in an Array
//Given an integer array nums and an integer k, return the kth largest element in the array.
//
//        Note that it is the kth largest element in the sorted order, not the kth distinct element.
//
//
//
//        Example 1:
//
//        Input: nums = [3,2,1,5,6,4], k = 2 [1,2,3,4,5,6]
//        Output: 5
//        Example 2:
//
//        Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//        Output: 4
public class kLargest {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k= 4;
        System.out.println(findKthLargest(nums,k));
    }

    static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
