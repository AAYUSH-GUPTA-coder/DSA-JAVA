package com.aayush;
// Replace every array element by multiplication of previous and next in an array(easy).

//Given an array of integers, update every element with multiplication of previous and next elements with following exceptions.
//        a) First element is replaced by multiplication of first and second.
//        b) Last element is replaced by multiplication of last and second last.
//
//        Example:
//
//        Input: arr[] = {2, 3, 4, 5, 6}
//        Output: arr[] = {6, 8, 15, 24, 30}

import java.util.Arrays;

// We get the above output using following
// arr[] = {2*3, 2*4, 3*5, 4*6, 5*6}
public class Multiplication {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        multi(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void multi(int[] arr){
        int prev, current;
        int len = arr.length;
        // changing the value of first element
        prev = arr[0];
        arr[0] = arr[0] * arr[1];
//        Input: arr[] = {2, 3, 4, 5, 6}
//        Output: arr[] = {6, 8, 15, 24, 30}
        // changing the value of all middle elements
        for(int i=1;i<len-1;i++){
            current = arr[i];
            arr[i] = prev * arr[i+1];
            prev = current;
        }
        // changing the value of end element
        arr[len-1] = arr[len-1] * prev;
    }
}
