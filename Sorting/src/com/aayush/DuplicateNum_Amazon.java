package com.aayush;
//287. Find the Duplicate Number

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//        There is only one repeated number in nums, return this repeated number.
//
//        You must solve the problem without modifying the array nums and uses only constant extra space.
//
//
//
//        Example 1:
//
//        Input: nums = [1,3,4,2,2]
//        Output: 2
//        Example 2:
//
//        Input: nums = [3,1,3,4,2]
//        Output: 3

public class DuplicateNum_Amazon {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(Sorting(nums));
    }

    static int Sorting(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - i;
                if (nums[i] != nums[correctIndex]) {
                    swap(i, correctIndex, nums);
                } else {
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] =nums[b];
        nums[b] = temp;
    }
}
