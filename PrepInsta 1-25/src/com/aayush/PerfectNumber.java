package com.aayush;

import java.util.Scanner;

//Perfect number is a number whose sum of factors is equal to the given number. Let us consider an example for better understanding.
//
//        Example :
//
//        Suppose a number  is 28 ;
//        Factors of 28 are : 1, 2, 4, 7, 14 ;
//        Sum of Factors of the number  = 28 ;
//        Here the sum of factors of the number is equal to the given number ;
//
//        So, 28 is a Perfect Number.
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("enter the Number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(Perfect(num));
    }

    static boolean Perfect(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num % i == 0){
                sum = sum+i;
            }
        }
        return sum == num;
    }
}
