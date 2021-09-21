package com.aayush;
//Find the Sum of first N natural Numbers
//        We know that Natural number is integer number which is to start from 1,2,3,4…… and so on.
//
//        So we will calculate the First N natural number
//
//        In the sum o first N natural number user gave the value of N if the value is 6 then process is following
//
//        1+2+3+4+5+6 = 21

import java.util.*;
public class NnaturalNumSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(NnaturalNumberSum(num));
    }

    static int NnaturalNumberSum(int num){
        int sum =0;
        while(num > 0){
            sum += num;
            num--;
        }
        return sum;
    }
}
